package com.google.android.material.badge;

import J2.i;
import P2.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.card.MaterialCardView;
import com.luminary.mobile.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import t2.C1279a;

/* loaded from: classes.dex */
public final class BadgeState {

    /* renamed from: a, reason: collision with root package name */
    public final State f9055a;

    /* renamed from: b, reason: collision with root package name */
    public final State f9056b = new State();

    /* renamed from: c, reason: collision with root package name */
    public final float f9057c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9058d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9059e;

    /* renamed from: f, reason: collision with root package name */
    public final float f9060f;

    /* renamed from: g, reason: collision with root package name */
    public final float f9061g;

    /* renamed from: h, reason: collision with root package name */
    public final float f9062h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9063j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9064k;

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* renamed from: A, reason: collision with root package name */
        public Integer f9065A;

        /* renamed from: B, reason: collision with root package name */
        public Integer f9066B;

        /* renamed from: C, reason: collision with root package name */
        public Integer f9067C;

        /* renamed from: D, reason: collision with root package name */
        public Boolean f9068D;

        /* renamed from: a, reason: collision with root package name */
        public int f9069a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f9070b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f9071c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f9072d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f9073e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f9074f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f9075g;

        /* renamed from: h, reason: collision with root package name */
        public Integer f9076h;

        /* renamed from: j, reason: collision with root package name */
        public String f9077j;

        /* renamed from: n, reason: collision with root package name */
        public Locale f9081n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f9082o;

        /* renamed from: p, reason: collision with root package name */
        public CharSequence f9083p;

        /* renamed from: q, reason: collision with root package name */
        public int f9084q;

        /* renamed from: r, reason: collision with root package name */
        public int f9085r;

        /* renamed from: s, reason: collision with root package name */
        public Integer f9086s;

        /* renamed from: u, reason: collision with root package name */
        public Integer f9088u;

        /* renamed from: v, reason: collision with root package name */
        public Integer f9089v;

        /* renamed from: w, reason: collision with root package name */
        public Integer f9090w;

        /* renamed from: x, reason: collision with root package name */
        public Integer f9091x;

        /* renamed from: y, reason: collision with root package name */
        public Integer f9092y;

        /* renamed from: z, reason: collision with root package name */
        public Integer f9093z;
        public int i = 255;

        /* renamed from: k, reason: collision with root package name */
        public int f9078k = -2;

        /* renamed from: l, reason: collision with root package name */
        public int f9079l = -2;

        /* renamed from: m, reason: collision with root package name */
        public int f9080m = -2;

        /* renamed from: t, reason: collision with root package name */
        public Boolean f9087t = Boolean.TRUE;

        public class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                State state = new State();
                state.i = 255;
                state.f9078k = -2;
                state.f9079l = -2;
                state.f9080m = -2;
                state.f9087t = Boolean.TRUE;
                state.f9069a = parcel.readInt();
                state.f9070b = (Integer) parcel.readSerializable();
                state.f9071c = (Integer) parcel.readSerializable();
                state.f9072d = (Integer) parcel.readSerializable();
                state.f9073e = (Integer) parcel.readSerializable();
                state.f9074f = (Integer) parcel.readSerializable();
                state.f9075g = (Integer) parcel.readSerializable();
                state.f9076h = (Integer) parcel.readSerializable();
                state.i = parcel.readInt();
                state.f9077j = parcel.readString();
                state.f9078k = parcel.readInt();
                state.f9079l = parcel.readInt();
                state.f9080m = parcel.readInt();
                state.f9082o = parcel.readString();
                state.f9083p = parcel.readString();
                state.f9084q = parcel.readInt();
                state.f9086s = (Integer) parcel.readSerializable();
                state.f9088u = (Integer) parcel.readSerializable();
                state.f9089v = (Integer) parcel.readSerializable();
                state.f9090w = (Integer) parcel.readSerializable();
                state.f9091x = (Integer) parcel.readSerializable();
                state.f9092y = (Integer) parcel.readSerializable();
                state.f9093z = (Integer) parcel.readSerializable();
                state.f9067C = (Integer) parcel.readSerializable();
                state.f9065A = (Integer) parcel.readSerializable();
                state.f9066B = (Integer) parcel.readSerializable();
                state.f9087t = (Boolean) parcel.readSerializable();
                state.f9081n = (Locale) parcel.readSerializable();
                state.f9068D = (Boolean) parcel.readSerializable();
                return state;
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9069a);
            parcel.writeSerializable(this.f9070b);
            parcel.writeSerializable(this.f9071c);
            parcel.writeSerializable(this.f9072d);
            parcel.writeSerializable(this.f9073e);
            parcel.writeSerializable(this.f9074f);
            parcel.writeSerializable(this.f9075g);
            parcel.writeSerializable(this.f9076h);
            parcel.writeInt(this.i);
            parcel.writeString(this.f9077j);
            parcel.writeInt(this.f9078k);
            parcel.writeInt(this.f9079l);
            parcel.writeInt(this.f9080m);
            CharSequence charSequence = this.f9082o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f9083p;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f9084q);
            parcel.writeSerializable(this.f9086s);
            parcel.writeSerializable(this.f9088u);
            parcel.writeSerializable(this.f9089v);
            parcel.writeSerializable(this.f9090w);
            parcel.writeSerializable(this.f9091x);
            parcel.writeSerializable(this.f9092y);
            parcel.writeSerializable(this.f9093z);
            parcel.writeSerializable(this.f9067C);
            parcel.writeSerializable(this.f9065A);
            parcel.writeSerializable(this.f9066B);
            parcel.writeSerializable(this.f9087t);
            parcel.writeSerializable(this.f9081n);
            parcel.writeSerializable(this.f9068D);
        }
    }

    public BadgeState(Context context, State state) {
        AttributeSet attributeSet;
        int i;
        int next;
        State state2 = state == null ? new State() : state;
        int i9 = state2.f9069a;
        if (i9 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i9);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                i = asAttributeSet.getStyleAttribute();
                attributeSet = asAttributeSet;
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(androidx.camera.core.impl.utils.a.g(i9, new StringBuilder("Can't load badge resource ID #0x")));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray d10 = i.d(context, attributeSet, C1279a.f27486c, R.attr.badgeStyle, i == 0 ? 2132083836 : i, new int[0]);
        Resources resources = context.getResources();
        this.f9057c = d10.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f9063j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f9058d = d10.getDimensionPixelSize(14, -1);
        this.f9059e = d10.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f9061g = d10.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f9060f = d10.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.f9062h = d10.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f9064k = d10.getInt(24, 1);
        State state3 = this.f9056b;
        int i10 = state2.i;
        state3.i = i10 == -2 ? 255 : i10;
        int i11 = state2.f9078k;
        if (i11 != -2) {
            state3.f9078k = i11;
        } else if (d10.hasValue(23)) {
            this.f9056b.f9078k = d10.getInt(23, 0);
        } else {
            this.f9056b.f9078k = -1;
        }
        String str = state2.f9077j;
        if (str != null) {
            this.f9056b.f9077j = str;
        } else if (d10.hasValue(7)) {
            this.f9056b.f9077j = d10.getString(7);
        }
        State state4 = this.f9056b;
        state4.f9082o = state2.f9082o;
        CharSequence charSequence = state2.f9083p;
        state4.f9083p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        State state5 = this.f9056b;
        int i12 = state2.f9084q;
        state5.f9084q = i12 == 0 ? R.plurals.mtrl_badge_content_description : i12;
        int i13 = state2.f9085r;
        state5.f9085r = i13 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i13;
        Boolean bool = state2.f9087t;
        state5.f9087t = Boolean.valueOf(bool == null || bool.booleanValue());
        State state6 = this.f9056b;
        int i14 = state2.f9079l;
        state6.f9079l = i14 == -2 ? d10.getInt(21, -2) : i14;
        State state7 = this.f9056b;
        int i15 = state2.f9080m;
        state7.f9080m = i15 == -2 ? d10.getInt(22, -2) : i15;
        State state8 = this.f9056b;
        Integer num = state2.f9073e;
        state8.f9073e = Integer.valueOf(num == null ? d10.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        State state9 = this.f9056b;
        Integer num2 = state2.f9074f;
        state9.f9074f = Integer.valueOf(num2 == null ? d10.getResourceId(6, 0) : num2.intValue());
        State state10 = this.f9056b;
        Integer num3 = state2.f9075g;
        state10.f9075g = Integer.valueOf(num3 == null ? d10.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        State state11 = this.f9056b;
        Integer num4 = state2.f9076h;
        state11.f9076h = Integer.valueOf(num4 == null ? d10.getResourceId(16, 0) : num4.intValue());
        State state12 = this.f9056b;
        Integer num5 = state2.f9070b;
        state12.f9070b = Integer.valueOf(num5 == null ? c.b(d10, context, 1).getDefaultColor() : num5.intValue());
        State state13 = this.f9056b;
        Integer num6 = state2.f9072d;
        state13.f9072d = Integer.valueOf(num6 == null ? d10.getResourceId(8, 2132083289) : num6.intValue());
        Integer num7 = state2.f9071c;
        if (num7 != null) {
            this.f9056b.f9071c = num7;
        } else if (d10.hasValue(9)) {
            this.f9056b.f9071c = Integer.valueOf(c.b(d10, context, 9).getDefaultColor());
        } else {
            int intValue = this.f9056b.f9072d.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, C1279a.f27483Q);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList b9 = c.b(obtainStyledAttributes, context, 3);
            c.b(obtainStyledAttributes, context, 4);
            c.b(obtainStyledAttributes, context, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i16 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i16, 0);
            obtainStyledAttributes.getString(i16);
            obtainStyledAttributes.getBoolean(14, false);
            c.b(obtainStyledAttributes, context, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, C1279a.f27469C);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f9056b.f9071c = Integer.valueOf(b9.getDefaultColor());
        }
        State state14 = this.f9056b;
        Integer num8 = state2.f9086s;
        state14.f9086s = Integer.valueOf(num8 == null ? d10.getInt(2, MaterialCardView.CHECKED_ICON_GRAVITY_TOP_END) : num8.intValue());
        State state15 = this.f9056b;
        Integer num9 = state2.f9088u;
        state15.f9088u = Integer.valueOf(num9 == null ? d10.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        State state16 = this.f9056b;
        Integer num10 = state2.f9089v;
        state16.f9089v = Integer.valueOf(num10 == null ? d10.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        State state17 = this.f9056b;
        Integer num11 = state2.f9090w;
        state17.f9090w = Integer.valueOf(num11 == null ? d10.getDimensionPixelOffset(18, 0) : num11.intValue());
        State state18 = this.f9056b;
        Integer num12 = state2.f9091x;
        state18.f9091x = Integer.valueOf(num12 == null ? d10.getDimensionPixelOffset(25, 0) : num12.intValue());
        State state19 = this.f9056b;
        Integer num13 = state2.f9092y;
        state19.f9092y = Integer.valueOf(num13 == null ? d10.getDimensionPixelOffset(19, state19.f9090w.intValue()) : num13.intValue());
        State state20 = this.f9056b;
        Integer num14 = state2.f9093z;
        state20.f9093z = Integer.valueOf(num14 == null ? d10.getDimensionPixelOffset(26, state20.f9091x.intValue()) : num14.intValue());
        State state21 = this.f9056b;
        Integer num15 = state2.f9067C;
        state21.f9067C = Integer.valueOf(num15 == null ? d10.getDimensionPixelOffset(20, 0) : num15.intValue());
        State state22 = this.f9056b;
        Integer num16 = state2.f9065A;
        state22.f9065A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        State state23 = this.f9056b;
        Integer num17 = state2.f9066B;
        state23.f9066B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        State state24 = this.f9056b;
        Boolean bool2 = state2.f9068D;
        state24.f9068D = Boolean.valueOf(bool2 == null ? d10.getBoolean(0, false) : bool2.booleanValue());
        d10.recycle();
        Locale locale = state2.f9081n;
        if (locale == null) {
            this.f9056b.f9081n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f9056b.f9081n = locale;
        }
        this.f9055a = state2;
    }
}
