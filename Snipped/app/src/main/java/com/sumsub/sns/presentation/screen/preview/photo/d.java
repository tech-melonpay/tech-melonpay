package com.sumsub.sns.presentation.screen.preview.photo;

import O9.p;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0650p;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;

/* loaded from: classes2.dex */
public final class d extends RecyclerView.C {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0650p<? super Integer, ? super b, p> f20037a;

    public d(View view) {
        super(view);
    }

    public final void a(InterfaceC0650p<? super Integer, ? super b, p> interfaceC0650p) {
        this.f20037a = interfaceC0650p;
    }

    public final SNSRotationZoomableImageView b() {
        return (SNSRotationZoomableImageView) this.itemView.findViewById(R$id.sns_photo);
    }

    public final void a(final int i, final b bVar) {
        SNSRotationZoomableImageView b9 = b();
        if (b9 != null) {
            b9.setImageBitmapWithRotation(bVar.e(), bVar.f());
        }
        SNSRotationZoomableImageView b10 = b();
        if (b10 != null) {
            b10.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.presentation.screen.preview.photo.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a(d.this, i, bVar, view);
                }
            });
        }
    }

    public static final void a(d dVar, int i, b bVar, View view) {
        InterfaceC0650p<? super Integer, ? super b, p> interfaceC0650p = dVar.f20037a;
        if (interfaceC0650p != null) {
            interfaceC0650p.invoke(Integer.valueOf(i), bVar);
        }
    }
}
