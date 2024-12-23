/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.sunflower.compose.plantdetail

import android.content.ContentResolver
import android.net.Uri
import androidx.annotation.RawRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.core.net.toUri
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.samples.apps.sunflower.compose.plantdetail.PlantDetails
import com.google.samples.apps.sunflower.compose.plantdetail.PlantDetailsCallbacks
import com.google.samples.apps.sunflower.data.Plant
import com.google.samples.apps.sunflower.test.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PlantDetailComposeTestDup21 {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun plantDetails_checkIsNotPlanted() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsNotPlanted_dup() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted_dup() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsNotPlanted_dup_dup() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted_dup_dup() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }
    @Test
    fun plantDetails_checkIsNotPlanted_dup_dup_dup() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted_dup_dup_dup() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }
    @Test
    fun plantDetails_checkIsNotPlanted_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }
    @Test
    fun plantDetails_checkIsNotPlanted_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }
    @Test
    fun plantDetails_checkIsNotPlanted_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsNotPlanted_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsNotPlanted_dup_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted_dup_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown_dup_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown_dup_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsNotPlanted_dup_dup_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted_dup_dup_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown_dup_dup_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown_dup_dup_dup_dup_dup_dup_dup_dup_dup() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsNotPlanted_dup1() {
        startPlantDetails(isPlanted = false)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertIsDisplayed()
    }

    @Test
    fun plantDetails_checkIsPlanted_dup1() {
        startPlantDetails(isPlanted = true)
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Add plant").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryNotShown_dup1() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = false)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertDoesNotExist()
    }

    @Test
    fun plantDetails_checkGalleryIsShown_dup1() {
        startPlantDetails(isPlanted = true, hasUnsplashKey = true)
        composeTestRule.onNodeWithContentDescription("Gallery Icon").assertIsDisplayed()
    }

    private fun startPlantDetails(isPlanted: Boolean, hasUnsplashKey: Boolean = false) {
        composeTestRule.setContent {
            PlantDetails(
                plant = plantForTesting(),
                isPlanted = isPlanted,
                callbacks = PlantDetailsCallbacks({ }, { }, { }, { }),
                hasValidUnsplashKey = hasUnsplashKey
            )
        }
    }
}