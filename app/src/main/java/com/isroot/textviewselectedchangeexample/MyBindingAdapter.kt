package com.isroot.textviewselectedchangeexample

import android.view.View
import androidx.databinding.BindingAdapter


@BindingAdapter("binding:isSelected")
fun bindColors(view: View, isSelected: Boolean) {
    view.isSelected = isSelected
}