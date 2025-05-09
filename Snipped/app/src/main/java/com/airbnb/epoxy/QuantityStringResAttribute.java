package com.airbnb.epoxy;

import android.content.Context;
import java.util.Arrays;

/* loaded from: classes.dex */
public class QuantityStringResAttribute {
    private final Object[] formatArgs;
    private final int id;
    private final int quantity;

    public QuantityStringResAttribute(int i, int i9, Object[] objArr) {
        this.quantity = i9;
        this.id = i;
        this.formatArgs = objArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuantityStringResAttribute)) {
            return false;
        }
        QuantityStringResAttribute quantityStringResAttribute = (QuantityStringResAttribute) obj;
        if (this.id == quantityStringResAttribute.id && this.quantity == quantityStringResAttribute.quantity) {
            return Arrays.equals(this.formatArgs, quantityStringResAttribute.formatArgs);
        }
        return false;
    }

    public Object[] getFormatArgs() {
        return this.formatArgs;
    }

    public int getId() {
        return this.id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return Arrays.hashCode(this.formatArgs) + (((this.id * 31) + this.quantity) * 31);
    }

    public CharSequence toString(Context context) {
        Object[] objArr = this.formatArgs;
        return (objArr == null || objArr.length == 0) ? context.getResources().getQuantityString(this.id, this.quantity) : context.getResources().getQuantityString(this.id, this.quantity, this.formatArgs);
    }

    public QuantityStringResAttribute(int i, int i9) {
        this(i, i9, null);
    }
}
