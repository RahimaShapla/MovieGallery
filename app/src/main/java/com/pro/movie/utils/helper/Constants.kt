package com.pro.movie.utils.helper


import com.itechsoftsolution.ebay.utils.helper.DataUtils
import com.pro.movie.R


class Constants {
    class Invalid {
        companion object {
            const val INVALID_INTEGER: Int = -1
        }
    }

    class Default {
        companion object {
            const val DEFAULT_STRING: String = ""
            const val DEFAULT_INTEGER: Int = 0
            const val DEFAULT_LONG: Long = 0
            const val DEFAULT_BOOLEAN: Boolean = false

        }
    }

    class Common {
        companion object {
            const val ANDROID_HASH_KEY = "Hash Key"
            const val COMMON_TIME_ZONE = "UTC"
            const val APP_COMMON_DATE_FORMAT: String = "dd MMMM, yyyy"
            const val APP_COMMON_ONLY_DATE_FORMAT: String = "dd MMMM, yyyy"
            const val APP_COMMON_TIME_FORMAT: String = "hh:mm a"
            const val APP_COMMON_DAY_FORMAT: String = "E"
            const val APP_COMMON_MONTH_FORMAT: String = "MMM"

        }
    }



    class File {
        companion object {
            val DIRECTORY_ROOT = DataUtils.getString(R.string.app_name)
            val PREFIX_IMAGE = "IMG_"
            val PREFIX_CROPPED_IMAGE = "IMG_CROPPED_"
            val SUFFIX_IMAGE = ".jpg"
        }
    }

    class  Preferences{
        companion object{
            const val EMAIL = "email"
            const val PASSWORD = "password"
            const val LATITUDE = "latitude"
            const val LONGITUDE = "longitude"
            const val IS_LOGGED_IN = "is_logged_in"
        }
    }


}