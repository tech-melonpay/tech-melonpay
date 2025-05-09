package com.airbnb.epoxy;

import android.content.Context;
import java.util.Arrays;

/* loaded from: classes.dex */
public class StringAttributeData {
    private final CharSequence defaultString;
    private final int defaultStringRes;
    private Object[] formatArgs;
    private final boolean hasDefault;
    private int pluralRes;
    private int quantity;
    private CharSequence string;
    private int stringRes;

    public StringAttributeData() {
        this.hasDefault = false;
        this.defaultString = null;
        this.defaultStringRes = 0;
    }

    private void handleInvalidStringRes() {
        if (!this.hasDefault) {
            throw new IllegalArgumentException("0 is an invalid value for required strings.");
        }
        int i = this.defaultStringRes;
        if (i != 0) {
            setValue(i);
        } else {
            setValue(this.defaultString);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringAttributeData)) {
            return false;
        }
        StringAttributeData stringAttributeData = (StringAttributeData) obj;
        if (this.stringRes != stringAttributeData.stringRes || this.pluralRes != stringAttributeData.pluralRes || this.quantity != stringAttributeData.quantity) {
            return false;
        }
        CharSequence charSequence = this.string;
        if (charSequence == null ? stringAttributeData.string == null : charSequence.equals(stringAttributeData.string)) {
            return Arrays.equals(this.formatArgs, stringAttributeData.formatArgs);
        }
        return false;
    }

    public int hashCode() {
        CharSequence charSequence = this.string;
        return Arrays.hashCode(this.formatArgs) + ((((((((charSequence != null ? charSequence.hashCode() : 0) * 31) + this.stringRes) * 31) + this.pluralRes) * 31) + this.quantity) * 31);
    }

    public void setValue(CharSequence charSequence) {
        this.string = charSequence;
        this.stringRes = 0;
        this.pluralRes = 0;
    }

    public CharSequence toString(Context context) {
        return this.pluralRes != 0 ? this.formatArgs != null ? context.getResources().getQuantityString(this.pluralRes, this.quantity, this.formatArgs) : context.getResources().getQuantityString(this.pluralRes, this.quantity) : this.stringRes != 0 ? this.formatArgs != null ? context.getResources().getString(this.stringRes, this.formatArgs) : context.getResources().getText(this.stringRes) : this.string;
    }

    public void setValue(int i) {
        setValue(i, null);
    }

    public StringAttributeData(CharSequence charSequence) {
        this.hasDefault = true;
        this.defaultString = charSequence;
        this.string = charSequence;
        this.defaultStringRes = 0;
    }

    public void setValue(int i, Object[] objArr) {
        if (i != 0) {
            this.stringRes = i;
            this.formatArgs = objArr;
            this.string = null;
            this.pluralRes = 0;
            return;
        }
        handleInvalidStringRes();
    }

    public StringAttributeData(int i) {
        this.hasDefault = true;
        this.defaultStringRes = i;
        this.stringRes = i;
        this.defaultString = null;
    }

    public void setValue(int i, int i9, Object[] objArr) {
        if (i != 0) {
            this.pluralRes = i;
            this.quantity = i9;
            this.formatArgs = objArr;
            this.string = null;
            this.stringRes = 0;
            return;
        }
        handleInvalidStringRes();
    }
}
