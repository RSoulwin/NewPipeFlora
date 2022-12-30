package org.schabi.newpipelegacy.local.subscription;

import static org.schabi.newpipelegacy.util.Localization.assureCorrectAppLanguage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import org.schabi.newpipelegacy.R;

import icepick.Icepick;
import icepick.State;

public class ImportConfirmationDialog extends DialogFragment {
    @State
    protected Intent resultServiceIntent;

    public static void show(@NonNull final Fragment fragment,
                            @NonNull final Intent resultServiceIntent) {
        final ImportConfirmationDialog confirmationDialog = new ImportConfirmationDialog();
        confirmationDialog.setResultServiceIntent(resultServiceIntent);
        confirmationDialog.show(fragment.getParentFragmentManager(), null);
    }

    public void setResultServiceIntent(final Intent resultServiceIntent) {
        this.resultServiceIntent = resultServiceIntent;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable final Bundle savedInstanceState) {
        assureCorrectAppLanguage(getContext());
        return new AlertDialog.Builder(requireContext())
                .setMessage(R.string.import_network_expensive_warning)
                .setCancelable(true)
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.ok, (dialogInterface, i) -> {
                    if (resultServiceIntent != null && getContext() != null) {
                        getContext().startService(resultServiceIntent);
                    }
                    dismiss();
                })
                .create();
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (resultServiceIntent == null) {
            throw new IllegalStateException("Result intent is null");
        }

        Icepick.restoreInstanceState(this, savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(@NonNull final Bundle outState) {
        super.onSaveInstanceState(outState);
        Icepick.saveInstanceState(this, outState);
    }
}
