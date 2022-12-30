package org.schabi.newpipelegacy.local.feed.service

import org.schabi.newpipe.extractor.ListInfo
import org.schabi.newpipe.extractor.stream.StreamInfoItem
import org.schabi.newpipelegacy.database.subscription.NotificationMode
import org.schabi.newpipelegacy.database.subscription.SubscriptionEntity

data class FeedUpdateInfo(
    val uid: Long,
    @NotificationMode
    val notificationMode: Int,
    val name: String,
    val avatarUrl: String,
    val listInfo: ListInfo<StreamInfoItem>,
) {
    constructor(
        subscription: SubscriptionEntity,
        listInfo: ListInfo<StreamInfoItem>,
    ) : this(
        uid = subscription.uid,
        notificationMode = subscription.notificationMode,
        name = subscription.name,
        avatarUrl = subscription.avatarUrl,
        listInfo = listInfo,
    )

    /**
     * Integer id, can be used as notification id, etc.
     */
    val pseudoId: Int
        get() = listInfo.url.hashCode()

    lateinit var newStreams: List<StreamInfoItem>
}
