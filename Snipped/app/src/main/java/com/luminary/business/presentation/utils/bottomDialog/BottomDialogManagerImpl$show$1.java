package com.luminary.business.presentation.utils.bottomDialog;

import F8.o;
import O9.p;
import V9.d;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.bumptech.glide.Glide;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.business.presentation.utils.bottomDialog.a;
import com.luminary.mobile.R;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import t6.AbstractC1344h;

/* compiled from: BottomDialogManagerImpl.kt */
@d(c = "com.luminary.business.presentation.utils.bottomDialog.BottomDialogManagerImpl$show$1", f = "BottomDialogManagerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BottomDialogManagerImpl$show$1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BottomDialogManagerImpl f13285u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0635a<Object> f13286v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0635a<Object> f13287w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BottomDialogType f13288x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomDialogManagerImpl$show$1(BottomDialogManagerImpl bottomDialogManagerImpl, InterfaceC0635a<? extends Object> interfaceC0635a, InterfaceC0635a<? extends Object> interfaceC0635a2, BottomDialogType bottomDialogType, T9.a<? super BottomDialogManagerImpl$show$1> aVar) {
        super(2, aVar);
        this.f13285u = bottomDialogManagerImpl;
        this.f13286v = interfaceC0635a;
        this.f13287w = interfaceC0635a2;
        this.f13288x = bottomDialogType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new BottomDialogManagerImpl$show$1(this.f13285u, this.f13286v, this.f13287w, this.f13288x, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
        return ((BottomDialogManagerImpl$show$1) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        b.b(obj);
        BottomDialogManagerImpl bottomDialogManagerImpl = this.f13285u;
        a aVar = bottomDialogManagerImpl.f13283a;
        (aVar == null ? null : aVar).f13313r = this.f13286v;
        (aVar == null ? null : aVar).f13314s = this.f13287w;
        if (aVar == null) {
            aVar = null;
        }
        aVar.j().setState(3);
        AbstractC1344h abstractC1344h = aVar.f13312q;
        TextView textView = abstractC1344h.f29039t;
        BottomDialogType bottomDialogType = this.f13288x;
        int ordinal = bottomDialogType.ordinal();
        textView.setText(ordinal != 0 ? ordinal != 1 ? null : aVar.getContext().getString(R.string.success) : aVar.getContext().getString(R.string.error));
        String str = bottomDialogType.f13295a;
        TextView textView2 = abstractC1344h.f29039t;
        if (str != null) {
            textView2.setText(str);
        }
        Boolean bool = bottomDialogType.f13303j;
        ImageView imageView = abstractC1344h.f29037r;
        if (bool != null) {
            imageView.setVisibility(0);
        } else {
            o.b(imageView);
        }
        Float f10 = bottomDialogType.i;
        if (f10 != null) {
            textView2.setLineSpacing(f10.floatValue(), 1.0f);
        }
        Float f11 = bottomDialogType.f13302h;
        if (f11 != null) {
            textView2.setTextSize(f11.floatValue());
        }
        String str2 = bottomDialogType.f13296b;
        TextView textView3 = abstractC1344h.f29038s;
        if (str2 == null) {
            o.b(textView3);
        } else {
            textView3.setVisibility(0);
            textView3.setText(bottomDialogType.f13296b);
        }
        String string = aVar.getContext().getString(R.string.back);
        Button button = abstractC1344h.f29035p;
        button.setText(string);
        String str3 = bottomDialogType.f13299e;
        Button button2 = abstractC1344h.f29034o;
        if (str3 != null) {
            button2.setText(str3);
        }
        String str4 = bottomDialogType.f13297c;
        Button button3 = abstractC1344h.f29033n;
        if (str4 != null) {
            button.setText(str4);
            button3.setText(str4);
        }
        Integer num = bottomDialogType.f13300f;
        ImageView imageView2 = abstractC1344h.f29036q;
        if (num != null) {
            Glide.with(imageView2).load(Integer.valueOf(num.intValue())).into(imageView2);
        }
        BottomDialogType.Type type = bottomDialogType.f13301g;
        if (type != null) {
            Glide.with(imageView2).load("file:///android_asset/" + type.f13311a + ".gif").into(imageView2);
        }
        Integer num2 = bottomDialogType.f13298d;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue == R.drawable.button_bg) {
                o.h(button3, R.color.main_button_text_color);
            } else {
                o.h(button3, R.color.sl_text_black_button);
            }
            button3.setBackgroundResource(intValue);
        }
        if (a.C0139a.f13315a[bottomDialogType.ordinal()] == 3) {
            o.b(button);
            button3.setVisibility(0);
            button2.setVisibility(0);
        } else {
            Integer num3 = bottomDialogType.f13298d;
            if (num3 != null) {
                button.setBackgroundResource(num3.intValue());
                Integer num4 = bottomDialogType.f13298d;
                if (num4 != null && num4.intValue() == R.drawable.button_bg) {
                    o.h(button, R.color.main_button_text_color);
                } else {
                    o.h(button, R.color.sl_text_black_button);
                }
            } else {
                button.setBackgroundResource(R.drawable.bg_button_black);
                o.h(button, R.color.sl_text_black_button);
            }
            button.setVisibility(0);
            o.b(button3);
            o.b(button2);
        }
        a aVar2 = bottomDialogManagerImpl.f13283a;
        (aVar2 != null ? aVar2 : null).show();
        return p.f3034a;
    }
}
