package com.sumsub.sns.core.common;

import O9.p;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import ca.InterfaceC0646l;
import com.luminary.mobile.R;
import com.squareup.picasso.Picasso;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.model.SNSSupportItem;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;

/* loaded from: classes2.dex */
public final class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14017a;

        static {
            int[] iArr = new int[SNSSupportItem.Type.values().length];
            iArr[SNSSupportItem.Type.Url.ordinal()] = 1;
            iArr[SNSSupportItem.Type.Email.ordinal()] = 2;
            f14017a = iArr;
        }
    }

    public static final class d extends com.sumsub.sns.core.presentation.base.text.span.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l<String, p> f14018a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ URLSpan f14019b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(InterfaceC0646l<? super String, p> interfaceC0646l, URLSpan uRLSpan) {
            this.f14018a = interfaceC0646l;
            this.f14019b = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            InterfaceC0646l<String, p> interfaceC0646l = this.f14018a;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(this.f14019b.getURL());
            }
        }
    }

    public static final void a(TextView textView, InterfaceC0646l<? super String, p> interfaceC0646l) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(textView.getText());
        for (Object obj : valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
            URLSpan uRLSpan = (URLSpan) obj;
            valueOf.setSpan(new d(interfaceC0646l, uRLSpan), valueOf.getSpanStart(uRLSpan), valueOf.getSpanEnd(uRLSpan), 17);
            valueOf.removeSpan(uRLSpan);
        }
        textView.setText(valueOf);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static final boolean a(SNSSupportItem sNSSupportItem, Context context) {
        SNSEventHandler eventHandler = e0.f15081a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(new SNSEvent.SupportItemClicked(sNSSupportItem.getType().name(), sNSSupportItem.getValue()));
        }
        if (sNSSupportItem.getOnClick() != null) {
            InterfaceC0646l<SNSSupportItem, p> onClick = sNSSupportItem.getOnClick();
            if (onClick != null) {
                onClick.invoke(sNSSupportItem);
            }
            return true;
        }
        int i = a.f14017a[sNSSupportItem.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return i.a(context, Uri.parse("mailto:" + sNSSupportItem.getValue()));
        }
        String value = sNSSupportItem.getValue();
        if (!value.startsWith("https://") && !value.startsWith("http://")) {
            value = "http://".concat(value);
        }
        return i.a(context, Uri.parse(value));
    }

    public static final CharSequence a(CharSequence charSequence, Context context, boolean z10) {
        if (!z10) {
            return charSequence;
        }
        return new SpannableStringBuilder(charSequence).append(" *", new ForegroundColorSpan(i.a(context, R.attr.colorOnError)), 33);
    }

    public static final int a(TypedArray typedArray, int i, int i9) {
        if (typedArray.hasValue(i)) {
            if (typedArray.peekValue(i).type == 2) {
                int resourceId = typedArray.getResourceId(i, -1);
                if (resourceId != -1) {
                    return typedArray.getColor(resourceId, i9);
                }
            } else {
                return typedArray.getColor(i, i9);
            }
        }
        return i9;
    }

    public static final float a(int i) {
        return i * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final Picasso a(Context context) {
        com.sumsub.sns.internal.core.a f10;
        com.sumsub.sns.core.presentation.a aVar = context instanceof com.sumsub.sns.core.presentation.a ? (com.sumsub.sns.core.presentation.a) context : null;
        if (aVar == null || (f10 = aVar.f()) == null) {
            return null;
        }
        return f10.A();
    }
}
