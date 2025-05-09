package com.chuckerteam.chucker.internal.support;

import P9.l;
import P9.n;
import P9.s;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import com.luminary.mobile.R;
import com.sumsub.sns.internal.core.data.model.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

/* compiled from: SpanTextUtil.kt */
/* loaded from: classes.dex */
public final class SpanTextUtil {

    /* renamed from: a, reason: collision with root package name */
    public final int f8649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8650b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8651c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8652d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8653e;

    /* compiled from: SpanTextUtil.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$ChuckerForegroundColorSpan;", "Landroid/text/style/ForegroundColorSpan;", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
    public static final class ChuckerForegroundColorSpan extends ForegroundColorSpan {
    }

    /* compiled from: SpanTextUtil.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/chuckerteam/chucker/internal/support/SpanTextUtil$TokenType;", "", "a", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
    public enum TokenType {
        STRING(Collections.singleton("\"")),
        ARRAY(l.w(new String[]{"[", "]"})),
        OBJECT(l.w(new String[]{"{", "}"})),
        KEY_SEPARATOR(Collections.singleton(p.f15541a)),
        VALUE_SEPARATOR(Collections.singleton(",")),
        BOOLEAN(l.w(new String[]{"true", "false"})),
        NONE(EmptySet.f23106a);


        /* renamed from: b, reason: collision with root package name */
        public static final a f8654b = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final Set<String> f8655c;

        /* renamed from: a, reason: collision with root package name */
        public final Set<String> f8663a;

        /* compiled from: SpanTextUtil.kt */
        public static final class a {
        }

        static {
            TokenType[] values = values();
            ArrayList arrayList = new ArrayList(values.length);
            for (TokenType tokenType : values) {
                arrayList.add(tokenType.f8663a);
            }
            f8655c = s.g0(n.v(arrayList));
        }

        TokenType(Set set) {
            this.f8663a = set;
        }
    }

    /* compiled from: SpanTextUtil.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8664a;

        static {
            int[] iArr = new int[TokenType.values().length];
            try {
                iArr[TokenType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TokenType.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TokenType.OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TokenType.KEY_SEPARATOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TokenType.VALUE_SEPARATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TokenType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TokenType.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f8664a = iArr;
        }
    }

    public SpanTextUtil(Context context) {
        this.f8649a = C0913a.getColor(context, R.color.chucker_json_key_color);
        this.f8650b = C0913a.getColor(context, R.color.chucker_json_value_color);
        this.f8651c = C0913a.getColor(context, R.color.chucker_json_digit_and_null_value_color);
        this.f8652d = C0913a.getColor(context, R.color.chucker_json_elements_color);
        this.f8653e = C0913a.getColor(context, R.color.chucker_json_boolean_color);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.text.SpannableStringBuilder a(java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.support.SpanTextUtil.a(java.lang.CharSequence):android.text.SpannableStringBuilder");
    }
}
