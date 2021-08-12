package com.example.netologydiploma.dto


data class Post(
    val id: Long = 0L,
    val authorId: Long = 0L,
    val author: String = "Alex Popov",
    val authorAvatar: String = "",
    val content: String = "",
    val published: Long = 0L,
    val likedByMe: Boolean = false,
    val likeCount: Int = 0,
    val coords: Coords? = null,
    var attachment: MediaAttachment? = null,
    val ownedByMe: Boolean = false,
    val likeOwnerIds: Set<Int> = emptySet<Int>(),
    ) {
}

data class MediaAttachment(
    val url: String,
    val type: AttachmentType
) {

}

data class Coords(
    val lat: Double = 0.0,
    val lng: Double = 0.0,
) {

}