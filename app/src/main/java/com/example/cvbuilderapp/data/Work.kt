package com.example.cvbuilderapp.data


data class Work(
    val companyName: String,
    val fromDate: String,
    val toDate: String,
    val location: String,
    val logo: String,
    val roles: String
) {
    companion object {
        fun getWorkList() : MutableList<Work> {
            return mutableListOf(
                Work(
                    "Erasoft Solution",
                    "Sept 2016",
                    "July 2021",
                    "Kathmandu nepal",
                    "https://media-exp1.licdn.com/dms/image/C560BAQFFDByEWfeiuA/company-logo_200_200/0/1609842664843?e=2147483647&v=beta&t=EEqdj3t-Bgwo0rUqJoa3lDsa47B2UmLMLgFzXeFEqNc",
                    "Software Developer"
                ),
                Work(
                    "TATA Motors",
                    "Jan 2012",
                    "Jan 2015",
                    "Kathmandu, Nepal",
                    "https://mma.prnewswire.com/media/1554321/Tata_Logo.jpg?w=200",
                    "Engineer"
                ),
            )
        }
    }
}