package com.example.recyclerviewkotlinprac.models

data class BlogPost(
    var title: String,
    var body: String,
    var image: String,  // pointer to the address of img
    var username: String
)