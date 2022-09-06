package com.microsoft.Deliver.Interface;


import com.google.firebase.database.core.view.View;

public interface ItemClickListner
{
    void onClick(View view, int position, boolean isLongClick);
}