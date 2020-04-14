package com.tap.mobile.ui.home.presentation.notelist

import androidx.recyclerview.widget.DiffUtil
import com.tap.mobile.ui.home.model.Note

class NoteDiffCallback(private val old: List<Note>,
                       private val new: List<Note>) : DiffUtil.Callback() {
    override fun getOldListSize() = old.size

    override fun getNewListSize() = new.size

    override fun areItemsTheSame(oldIndex: Int, newIndex: Int): Boolean {
        return old[oldIndex].text == new[newIndex].text
    }

    override fun areContentsTheSame(oldIndex: Int, newIndex: Int): Boolean {
        return old[oldIndex] == new[newIndex]
    }
}