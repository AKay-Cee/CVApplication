package com.example.cvbuilderapp.data


data class Education(
    val collegeName: String,
    val program: String,
    val logo: String
) {

    companion object {
        fun getEducationList() : MutableList<Education> {
            return mutableListOf(
                Education(
                    "Maharishi Internation University",
                    "Master's in Computer Science",
                    "https://maharishischool.org/wp-content/uploads/MaharishiSchoolTreeLogo-8cc541-green.jpg"
                ),
                Education(
                    "Beihang University",
                    "Masters in Mechatronics Engineering",
                    "https://upload.wikimedia.org/wikipedia/en/b/bd/Beihang_logo_2.png"
                )
            )
        }
    }
}