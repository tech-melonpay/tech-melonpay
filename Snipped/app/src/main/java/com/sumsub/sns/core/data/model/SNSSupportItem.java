package com.sumsub.sns.core.data.model;

import C.v;
import O9.p;
import android.graphics.drawable.Drawable;
import android.util.Patterns;
import androidx.annotation.Keep;
import ca.InterfaceC0646l;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.MessageBundle;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u00011B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJl\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b.\u0010\u0011R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001b¨\u00062"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSSupportItem;", "", "", MessageBundle.TITLE_ENTRY, "subtitle", "Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;", "type", "value", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "iconName", "Lkotlin/Function1;", "LO9/p;", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lca/l;)V", "isValid", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;", "component4", "component5", "()Landroid/graphics/drawable/Drawable;", "component6", "component7", "()Lca/l;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lca/l;)Lcom/sumsub/sns/core/data/model/SNSSupportItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;", "getType", "getValue", "Landroid/graphics/drawable/Drawable;", "getIconDrawable", "getIconName", "Lca/l;", "getOnClick", "Type", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final /* data */ class SNSSupportItem {
    private final Drawable iconDrawable;
    private final String iconName;
    private final InterfaceC0646l<SNSSupportItem, p> onClick;
    private final String subtitle;
    private final String title;
    private final Type type;
    private final String value;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/core/data/model/SNSSupportItem$Type;", "", "(Ljava/lang/String;I)V", "Url", "Email", "Custom", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Type {
        Url,
        Email,
        Custom
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            iArr[Type.Url.ordinal()] = 1;
            iArr[Type.Email.ordinal()] = 2;
            iArr[Type.Custom.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SNSSupportItem(String str, String str2, Type type, String str3, Drawable drawable, String str4, InterfaceC0646l<? super SNSSupportItem, p> interfaceC0646l) {
        this.title = str;
        this.subtitle = str2;
        this.type = type;
        this.value = str3;
        this.iconDrawable = drawable;
        this.iconName = str4;
        this.onClick = interfaceC0646l;
    }

    public static /* synthetic */ SNSSupportItem copy$default(SNSSupportItem sNSSupportItem, String str, String str2, Type type, String str3, Drawable drawable, String str4, InterfaceC0646l interfaceC0646l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sNSSupportItem.title;
        }
        if ((i & 2) != 0) {
            str2 = sNSSupportItem.subtitle;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            type = sNSSupportItem.type;
        }
        Type type2 = type;
        if ((i & 8) != 0) {
            str3 = sNSSupportItem.value;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            drawable = sNSSupportItem.iconDrawable;
        }
        Drawable drawable2 = drawable;
        if ((i & 32) != 0) {
            str4 = sNSSupportItem.iconName;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            interfaceC0646l = sNSSupportItem.onClick;
        }
        return sNSSupportItem.copy(str, str5, type2, str6, drawable2, str7, interfaceC0646l);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component5, reason: from getter */
    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    public final InterfaceC0646l<SNSSupportItem, p> component7() {
        return this.onClick;
    }

    public final SNSSupportItem copy(String title, String subtitle, Type type, String value, Drawable iconDrawable, String iconName, InterfaceC0646l<? super SNSSupportItem, p> onClick) {
        return new SNSSupportItem(title, subtitle, type, value, iconDrawable, iconName, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSSupportItem)) {
            return false;
        }
        SNSSupportItem sNSSupportItem = (SNSSupportItem) other;
        return f.b(this.title, sNSSupportItem.title) && f.b(this.subtitle, sNSSupportItem.subtitle) && this.type == sNSSupportItem.type && f.b(this.value, sNSSupportItem.value) && f.b(this.iconDrawable, sNSSupportItem.iconDrawable) && f.b(this.iconName, sNSSupportItem.iconName) && f.b(this.onClick, sNSSupportItem.onClick);
    }

    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public final InterfaceC0646l<SNSSupportItem, p> getOnClick() {
        return this.onClick;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int c2 = v.c((this.type.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.value);
        Drawable drawable = this.iconDrawable;
        int hashCode2 = (c2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str3 = this.iconName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC0646l<SNSSupportItem, p> interfaceC0646l = this.onClick;
        return hashCode3 + (interfaceC0646l != null ? interfaceC0646l.hashCode() : 0);
    }

    public final String isValid() {
        if (this.value.length() == 0 || C0969n.i0(this.value)) {
            return this + ". Value must not be empty or blank.";
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            if (Patterns.WEB_URL.matcher(this.value).matches()) {
                return null;
            }
            return this + ". Invalid url format";
        }
        if (i == 2) {
            if (Patterns.EMAIL_ADDRESS.matcher(this.value).matches()) {
                return null;
            }
            return this + ". Invalid email format";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.onClick != null) {
            return null;
        }
        return this + ". You have to implement your own onClick callback if you want to use a Custom type.";
    }

    public String toString() {
        return "SNSSupportItem(title=" + this.title + ", subtitle=" + this.subtitle + ", type=" + this.type + ", value=" + this.value + ", iconDrawable=" + this.iconDrawable + ", iconName=" + this.iconName + ", onClick=" + this.onClick + ')';
    }

    public /* synthetic */ SNSSupportItem(String str, String str2, Type type, String str3, Drawable drawable, String str4, InterfaceC0646l interfaceC0646l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, type, str3, (i & 16) != 0 ? null : drawable, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : interfaceC0646l);
    }
}
