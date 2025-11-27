package com.example.competition2k25.dataclasses

data class CampusFeed(
    val username: String,        // Username of the user who posted the content
    val content: String,         // The content or body of the post
    val timePosted: String,      // Time when the post was made (could be a formatted string)
    val likes: Int,              // Number of likes the post has received
    val comments: Int            // Number of comments the post has received
)
