package com.putuguna.staggeredgridview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by putuguna on 31/01/17.
 */
public class SpacesItemDecorationGridView extends RecyclerView.ItemDecoration {

    private final int mSpace;

    public SpacesItemDecorationGridView(int space) {
        this.mSpace = space;
    }
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = mSpace;
        outRect.right = mSpace;
        outRect.bottom = mSpace;
        outRect.top = mSpace;
    }
}
