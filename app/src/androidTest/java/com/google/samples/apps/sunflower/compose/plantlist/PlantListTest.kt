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

package com.google.samples.apps.sunflower.compose.plantlist

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.samples.apps.sunflower.compose.plantdetail.plantForTesting
import com.google.samples.apps.sunflower.data.Plant
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PlantListTest {
    @get:Rule
    val composeTestRule = createComposeRule()
    
    @Test
    fun plantList_itemShown() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    @Test
    fun plantList_itemShown1() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    @Test
    fun plantList_itemShown2() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    @Test
    fun plantList_itemShown3() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    @Test
    fun plantList_itemShown4() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    @Test
    fun plantList_itemShown5() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    @Test
    fun plantList_itemShown6() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    @Test
    fun plantList_itemShown7() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    @Test
    fun plantList_itemShown8() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    @Test
    fun plantList_itemShown9() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    @Test
    fun plantList_itemShown10() {
        startPlantList()
        composeTestRule.onNodeWithText("Apple").assertIsDisplayed()
    }

    private fun startPlantList(onPlantClick: (Plant) -> Unit = {}) {
        composeTestRule.setContent { 
            PlantListScreen(plants = listOf(plantForTesting()), onPlantClick = onPlantClick)
        }
    }
}