package com.api.igdb.utils

/*
* The image size options from the IGDB API
* */
enum class ImageSize(val tSize: String) {
    MICRO("t_micro"), // 35 x 35      Thumb, Center gravity
    THUMB("t_thumb"), // 90 x 90      Thumb, Center gravity
    COVER_SMALL("t_cover_small"), // 90 x 128     Fit
    COVER_BIG("t_cover_big"), // 264 x 374    Fit
    LOGO_MEDIUM("t_logo_med"), // 284 x 160    Fit
    SCREENSHOT_MEDIUM("t_screenshot_med"), // 569 x 320    Lfill, Center gravity
    SCREENSHOT_BIG("t_screenshot_big"), // 889 x 500    Lfill, Center gravity
    SCREENSHOT_HUGE("t_screenshot_huge"), // 1280 x 720   Lfill, Center gravity
    HD("t_720p"), // 1280 x 720   Fit, Center gravity
    FHD("t_1080p") // 1920 x 1080  Fit, Center gravity
}
