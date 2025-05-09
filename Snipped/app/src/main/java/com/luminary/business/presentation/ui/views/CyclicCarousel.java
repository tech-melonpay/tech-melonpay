package com.luminary.business.presentation.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.Carousel;
import x8.C1593a;

/* compiled from: CyclicCarousel.kt */
/* loaded from: classes2.dex */
public final class CyclicCarousel extends Carousel {
    public CyclicCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        super.setAdapter(new C1593a(adapter));
    }
}
