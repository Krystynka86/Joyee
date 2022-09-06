package com.example.joyee.models

import com.example.joyee.utils.DEFAULT_ICONS

class MemoryGame (private val boardSize: BoardSize) {

    val cards: List<MemoryCard>
    val numPairsFound = 0

    init {
        val chosenImages = DEFAULT_ICONS.shuffled().take(boardSize.getNumPairs())
        val radomizedImages = (chosenImages + chosenImages).shuffled()
        cards = radomizedImages.map { MemoryCard(it) }
    }
}
