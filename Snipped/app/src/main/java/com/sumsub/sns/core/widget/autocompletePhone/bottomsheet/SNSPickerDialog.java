package com.sumsub.sns.core.widget.autocompletePhone.bottomsheet;

import C.v;
import O9.p;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.lifecycle.C0552s;
import androidx.recyclerview.widget.C0564b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import ca.InterfaceC0646l;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.e;
import com.google.android.material.bottomsheet.f;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.mobile.R;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.core.widget.SNSBottomSheetView;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.theme.d;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ka.C0969n;
import kotlin.Metadata;
import org.bouncycastle.i18n.MessageBundle;

@Keep
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0017\u0018\u0000 A2\u00020\u0001:\u0006ABCDEFB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b$\u0010%J+\u0010*\u001a\u00020\u00062\n\u0010&\u001a\u00060\u000eR\u00020\u00002\u0006\u0010'\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b*\u0010+J\u001d\u00101\u001a\u00020.*\u00020(2\b\u0010-\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b/\u00100R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u00109\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104R\u0014\u0010<\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010@\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u000b¨\u0006G"}, d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog;", "Lcom/google/android/material/bottomsheet/f;", "<init>", "()V", "Lcom/google/android/material/bottomsheet/e;", "bottomSheetDialog", "LO9/p;", "setupFullHeight", "(Lcom/google/android/material/bottomsheet/e;)V", "", "getWindowHeight", "()I", "Landroid/view/ViewGroup;", "parentView", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerItemViewHolder;", "createItemViewHolder", "(Landroid/view/ViewGroup;)Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerItemViewHolder;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "onDismiss", "Landroid/view/View;", Promotion.ACTION_VIEW, "getThemeBackgroundColor", "(Landroid/view/View;)Ljava/lang/Integer;", "Landroid/view/LayoutInflater;", "inflater", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "holder", "position", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;", "item", "bindItemViewHolder", "(Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerItemViewHolder;ILcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;)V", "", SearchIntents.EXTRA_QUERY, "", "isEligibleForQuery$idensic_mobile_sdk_aar_release", "(Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;Ljava/lang/CharSequence;)Z", "isEligibleForQuery", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerCallBack;", "pickerCallBack", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerCallBack;", "getPickerCallBack", "()Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerCallBack;", "setPickerCallBack", "(Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerCallBack;)V", "internalPickerCallback", "getSortAlphabetically", "()Z", "sortAlphabetically", "getShowSearch", "showSearch", "getItemLayoutId", "itemLayoutId", "Companion", "DiffCallBack", "Item", "ItemAdapter", "PickerCallBack", "PickerItemViewHolder", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class SNSPickerDialog extends f {
    public static final String EXTRA_ITEMS = "extra_items";
    public static final String EXTRA_ITEM_LAYOUT_ID = "extra_item_layout_id";
    public static final String EXTRA_REQUEST_KEY = "extra_request_key";
    public static final String EXTRA_RESULT_KEY = "EXTRA_RESULT_KEY";
    public static final String EXTRA_SHOW_SEARCH = "extra_show_search";
    public static final String EXTRA_SORT = "extra_sort";
    public static final String TAG = "SNSPickerDialog";
    private final PickerCallBack internalPickerCallback = new PickerCallBack() { // from class: com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog$internalPickerCallback$1
        @Override // com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog.PickerCallBack
        public void onItemSelected(SNSPickerDialog.Item item) {
            Bundle arguments = SNSPickerDialog.this.getArguments();
            String string = arguments != null ? arguments.getString(SNSPickerDialog.EXTRA_REQUEST_KEY) : null;
            Bundle arguments2 = SNSPickerDialog.this.getArguments();
            String string2 = arguments2 != null ? arguments2.getString(SNSPickerDialog.EXTRA_RESULT_KEY) : null;
            if (string == null || string2 == null) {
                SNSPickerDialog.PickerCallBack pickerCallBack = SNSPickerDialog.this.getPickerCallBack();
                if (pickerCallBack != null) {
                    pickerCallBack.onItemSelected(item);
                }
            } else {
                SNSPickerDialog sNSPickerDialog = SNSPickerDialog.this;
                Bundle bundle = new Bundle();
                bundle.putParcelable(string2, item);
                p pVar = p.f3034a;
                sNSPickerDialog.getParentFragmentManager().f0(string, bundle);
            }
            SNSPickerDialog.PickerCallBack pickerCallBack2 = SNSPickerDialog.this.getPickerCallBack();
            if (pickerCallBack2 != null) {
                pickerCallBack2.onDialogClose();
            }
            SNSPickerDialog.this.dismiss();
        }
    };
    private PickerCallBack pickerCallBack;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$DiffCallBack;", "Landroidx/recyclerview/widget/q$b;", "", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "Ljava/util/List;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class DiffCallBack extends q.b {
        private final List<Item> newList;
        private final List<Item> oldList;

        public DiffCallBack(List<Item> list, List<Item> list2) {
            this.oldList = list;
            this.newList = list2;
        }

        @Override // androidx.recyclerview.widget.q.b
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return kotlin.jvm.internal.f.b(this.oldList.get(oldItemPosition), this.newList.get(newItemPosition));
        }

        @Override // androidx.recyclerview.widget.q.b
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return kotlin.jvm.internal.f.b(this.oldList.get(oldItemPosition), this.newList.get(newItemPosition));
        }

        @Override // androidx.recyclerview.widget.q.b
        public int getNewListSize() {
            return this.newList.size();
        }

        @Override // androidx.recyclerview.widget.q.b
        public int getOldListSize() {
            return this.oldList.size();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;", "Landroid/os/Parcelable;", "", "id", MessageBundle.TITLE_ENTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "LO9/p;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Item implements Parcelable {
        public static final Parcelable.Creator<Item> CREATOR = new Creator();
        private final String id;
        private final String title;

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                return new Item(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(String str, String str2) {
            this.id = str;
            this.title = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return kotlin.jvm.internal.f.b(this.id, item.id) && kotlin.jvm.internal.f.b(this.title, item.title);
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Item(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            return v.q(sb2, this.title, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u00012\u00020\u0004B7\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u00060\u0002R\u00020\u00030\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u00162\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u00060\u0002R\u00020\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$ItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerItemViewHolder;", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog;", "Landroid/widget/Filterable;", "", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;", FirebaseAnalytics.Param.ITEMS, "Ljava/text/Collator;", "collator", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "itemViewHolderFactory", "<init>", "(Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog;[Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;Ljava/text/Collator;Lca/l;)V", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerItemViewHolder;", "holder", "position", "LO9/p;", "onBindViewHolder", "(Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerItemViewHolder;I)V", "getItemCount", "()I", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "[Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;", "Ljava/text/Collator;", "Lca/l;", "Ljava/util/Comparator;", "itemComparator", "Ljava/util/Comparator;", "", "filteredItems", "Ljava/util/List;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public final class ItemAdapter extends RecyclerView.Adapter<PickerItemViewHolder> implements Filterable {
        private final Collator collator;
        private final List<Item> filteredItems;
        private final Comparator<Item> itemComparator;
        private final InterfaceC0646l<ViewGroup, PickerItemViewHolder> itemViewHolderFactory;
        private final Item[] items;

        /* JADX WARN: Multi-variable type inference failed */
        public ItemAdapter(Item[] itemArr, Collator collator, InterfaceC0646l<? super ViewGroup, PickerItemViewHolder> interfaceC0646l) {
            this.items = itemArr;
            this.collator = collator;
            this.itemViewHolderFactory = interfaceC0646l;
            Comparator<Item> comparator = new Comparator() { // from class: com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m74itemComparator$lambda0;
                    m74itemComparator$lambda0 = SNSPickerDialog.ItemAdapter.m74itemComparator$lambda0(SNSPickerDialog.ItemAdapter.this, (SNSPickerDialog.Item) obj, (SNSPickerDialog.Item) obj2);
                    return m74itemComparator$lambda0;
                }
            };
            this.itemComparator = comparator;
            ArrayList arrayList = new ArrayList();
            if (itemArr != null) {
                P9.q.w(arrayList, itemArr);
            }
            if (SNSPickerDialog.this.getSortAlphabetically()) {
                Collections.sort(arrayList, comparator);
            }
            this.filteredItems = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: itemComparator$lambda-0, reason: not valid java name */
        public static final int m74itemComparator$lambda0(ItemAdapter itemAdapter, Item item, Item item2) {
            return itemAdapter.collator.compare(item.getTitle(), item2.getTitle());
        }

        @Override // android.widget.Filterable
        public Filter getFilter() {
            final SNSPickerDialog sNSPickerDialog = SNSPickerDialog.this;
            return new Filter() { // from class: com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog$ItemAdapter$getFilter$1
                @Override // android.widget.Filter
                public Filter.FilterResults performFiltering(CharSequence constraint) {
                    SNSPickerDialog.Item[] itemArr;
                    ArrayList arrayList;
                    Comparator comparator;
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    SNSPickerDialog.ItemAdapter itemAdapter = SNSPickerDialog.ItemAdapter.this;
                    SNSPickerDialog sNSPickerDialog2 = sNSPickerDialog;
                    itemArr = itemAdapter.items;
                    if (itemArr != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (SNSPickerDialog.Item item : itemArr) {
                            if (sNSPickerDialog2.isEligibleForQuery$idensic_mobile_sdk_aar_release(item, constraint != null ? C0969n.u0(constraint) : null)) {
                                arrayList2.add(item);
                            }
                        }
                        arrayList = new ArrayList(arrayList2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (sNSPickerDialog2.getSortAlphabetically()) {
                        comparator = itemAdapter.itemComparator;
                        Collections.sort(arrayList, comparator);
                    }
                    filterResults.values = arrayList;
                    filterResults.count = arrayList.size();
                    return filterResults;
                }

                @Override // android.widget.Filter
                public void publishResults(CharSequence constraint, Filter.FilterResults results) {
                    List list;
                    List list2;
                    List list3;
                    Object obj = results != null ? results.values : null;
                    List list4 = obj instanceof List ? (List) obj : null;
                    if (list4 != null) {
                        SNSPickerDialog.ItemAdapter itemAdapter = SNSPickerDialog.ItemAdapter.this;
                        list = itemAdapter.filteredItems;
                        q.d a10 = q.a(new SNSPickerDialog.DiffCallBack(list, list4));
                        list2 = itemAdapter.filteredItems;
                        list2.clear();
                        list3 = itemAdapter.filteredItems;
                        list3.addAll(list4);
                        a10.a(new C0564b(itemAdapter));
                    }
                }
            };
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.filteredItems.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(PickerItemViewHolder holder, int position) {
            holder.bind(position, this.filteredItems.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public PickerItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return this.itemViewHolderFactory.invoke(parent);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog;Landroid/view/View;)V", "", "position", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;", "item", "LO9/p;", "bind", "(ILcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public final class PickerItemViewHolder extends RecyclerView.C {
        public PickerItemViewHolder(View view) {
            super(view);
        }

        public final void bind(int position, Item item) {
            SNSPickerDialog.this.bindItemViewHolder(this, position, item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindItemViewHolder$lambda-10, reason: not valid java name */
    public static final void m71bindItemViewHolder$lambda10(SNSPickerDialog sNSPickerDialog, Item item, View view) {
        sNSPickerDialog.internalPickerCallback.onItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PickerItemViewHolder createItemViewHolder(ViewGroup parentView) {
        Integer a10;
        View inflate = LayoutInflater.from(parentView.getContext()).inflate(getItemLayoutId(), parentView, false);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        d a11 = aVar.a();
        if (a11 != null && (a10 = aVar.a(a11, SNSColorElement.LIST_SELECTED_ITEM_BACKGROUND, aVar.a(inflate))) != null) {
            int intValue = a10.intValue();
            Drawable background = inflate.getBackground();
            RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(ColorStateList.valueOf(intValue));
            }
        }
        return new PickerItemViewHolder(inflate);
    }

    private final int getItemLayoutId() {
        return requireArguments().getInt(EXTRA_ITEM_LAYOUT_ID);
    }

    private final boolean getShowSearch() {
        return requireArguments().getBoolean(EXTRA_SHOW_SEARCH, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSortAlphabetically() {
        return requireArguments().getBoolean(EXTRA_SORT, true);
    }

    private final int getWindowHeight() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateDialog$lambda-0, reason: not valid java name */
    public static final void m72onCreateDialog$lambda0(SNSPickerDialog sNSPickerDialog, DialogInterface dialogInterface) {
        e eVar = (e) dialogInterface;
        if (sNSPickerDialog.getShowSearch()) {
            sNSPickerDialog.setupFullHeight(eVar);
        } else {
            BottomSheetBehavior.from((FrameLayout) eVar.findViewById(R.id.design_bottom_sheet)).setFitToContents(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-4, reason: not valid java name */
    public static final void m73onViewCreated$lambda4(SNSPickerDialog sNSPickerDialog, View view) {
        PickerCallBack pickerCallBack = sNSPickerDialog.pickerCallBack;
        if (pickerCallBack != null) {
            pickerCallBack.onDialogClose();
        }
        sNSPickerDialog.dismiss();
    }

    private final void setupFullHeight(e bottomSheetDialog) {
        Float a10;
        FrameLayout frameLayout = (FrameLayout) bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
        BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        int windowHeight = getWindowHeight();
        if (layoutParams != null) {
            layoutParams.height = windowHeight;
        }
        frameLayout.setLayoutParams(layoutParams);
        Integer themeBackgroundColor = getThemeBackgroundColor(frameLayout);
        if (themeBackgroundColor != null) {
            int intValue = themeBackgroundColor.intValue();
            Drawable background = frameLayout.getBackground();
            T2.f fVar = background instanceof T2.f ? (T2.f) background : null;
            if (fVar != null) {
                com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
                d a11 = aVar.a();
                if (a11 != null && (a10 = aVar.a(a11, SNSMetricElement.BOTTOM_SHEET_CORNER_RADIUS)) != null) {
                    fVar.m(a10.floatValue());
                }
                fVar.o(ColorStateList.valueOf(intValue));
                View findViewById = frameLayout.findViewById(R$id.sns_bottom_sheet);
                SNSBottomSheetView sNSBottomSheetView = findViewById instanceof SNSBottomSheetView ? (SNSBottomSheetView) findViewById : null;
                if (sNSBottomSheetView != null) {
                    sNSBottomSheetView.setBackground(null);
                }
            } else {
                frameLayout.setBackgroundColor(0);
            }
        }
        from.setState(3);
    }

    public void bindItemViewHolder(PickerItemViewHolder holder, int position, Item item) {
        View view = holder.itemView;
        ((TextView) view.findViewById(android.R.id.text1)).setText(item.getTitle());
        view.setOnClickListener(new B7.f(17, this, item));
    }

    public final PickerCallBack getPickerCallBack() {
        return this.pickerCallBack;
    }

    public Integer getThemeBackgroundColor(View view) {
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        d a10 = aVar.a();
        if (a10 != null) {
            return aVar.a(a10, SNSColorElement.BOTTOM_SHEET_BACKGROUND, aVar.a(view));
        }
        return null;
    }

    public final boolean isEligibleForQuery$idensic_mobile_sdk_aar_release(Item item, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return C0969n.Y(item.getTitle(), charSequence, true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        PickerCallBack pickerCallBack = this.pickerCallBack;
        if (pickerCallBack != null) {
            pickerCallBack.onCancel();
        }
    }

    @Override // com.google.android.material.bottomsheet.f, h.C0784k, androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        onCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SNSPickerDialog.m72onCreateDialog$lambda0(SNSPickerDialog.this, dialogInterface);
            }
        });
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getShowSearch() ? R$layout.sns_picker_dialog : R$layout.sns_picker_dialog_no_search, container, false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        PickerCallBack pickerCallBack = this.pickerCallBack;
        if (pickerCallBack != null) {
            pickerCallBack.onDismiss();
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Item[] itemArr;
        EditText editText;
        EditText editText2;
        EditText editText3;
        Parcelable[] parcelableArray;
        super.onViewCreated(view, savedInstanceState);
        SNSToolbarView sNSToolbarView = (SNSToolbarView) view.findViewById(R$id.sns_toolbar);
        if (sNSToolbarView != null) {
            Drawable onResolveIcon = e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.CLOSE.getImageName());
            if (onResolveIcon == null) {
                Resources resources = requireContext().getResources();
                int i = R$drawable.sns_ic_close;
                Resources.Theme theme = requireContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = m0.f.f23858a;
                onResolveIcon = resources.getDrawable(i, theme);
            }
            sNSToolbarView.setCloseButtonDrawable(onResolveIcon);
        }
        if (sNSToolbarView != null) {
            sNSToolbarView.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SNSPickerDialog.m73onViewCreated$lambda4(SNSPickerDialog.this, view2);
                }
            });
        }
        final TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R$id.sns_editor_layout);
        C0552s.a(this).b(new SNSPickerDialog$onViewCreated$2(this, textInputLayout, null));
        if (textInputLayout != null) {
            Drawable onResolveIcon2 = e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.SEARCH.getImageName());
            if (onResolveIcon2 == null) {
                Resources resources2 = requireContext().getResources();
                int i9 = R$drawable.sns_ic_search;
                Resources.Theme theme2 = requireContext().getTheme();
                ThreadLocal<TypedValue> threadLocal2 = m0.f.f23858a;
                onResolveIcon2 = resources2.getDrawable(i9, theme2);
            }
            textInputLayout.setStartIconDrawable(onResolveIcon2);
        }
        Bundle arguments = getArguments();
        if (arguments == null || (parcelableArray = arguments.getParcelableArray(EXTRA_ITEMS)) == null) {
            itemArr = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable instanceof Item) {
                    arrayList.add(parcelable);
                }
            }
            itemArr = (Item[]) arrayList.toArray(new Item[0]);
        }
        final ItemAdapter itemAdapter = new ItemAdapter(itemArr, Collator.getInstance(e0.f15081a.getLocale()), new InterfaceC0646l<ViewGroup, PickerItemViewHolder>() { // from class: com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog$onViewCreated$adapter$1
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final SNSPickerDialog.PickerItemViewHolder invoke(ViewGroup viewGroup) {
                SNSPickerDialog.PickerItemViewHolder createItemViewHolder;
                createItemViewHolder = SNSPickerDialog.this.createItemViewHolder(viewGroup);
                return createItemViewHolder;
            }
        });
        if (textInputLayout != null && (editText3 = textInputLayout.getEditText()) != null) {
            editText3.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog$onViewCreated$$inlined$doOnTextChanged$1
                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                    Filter filter = SNSPickerDialog.ItemAdapter.this.getFilter();
                    EditText editText4 = textInputLayout.getEditText();
                    filter.filter(editText4 != null ? editText4.getText() : null);
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s10) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }
            });
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R$id.sns_list);
        if (recyclerView != null) {
            recyclerView.getLayoutManager();
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(itemAdapter);
        }
        if (!getShowSearch()) {
            ViewGroup.LayoutParams layoutParams = recyclerView != null ? recyclerView.getLayoutParams() : null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                recyclerView.setLayoutParams(layoutParams);
            }
        }
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        d a10 = aVar.a();
        if (a10 != null) {
            Integer a11 = aVar.a(a10, SNSColorElement.LIST_SEPARATOR, recyclerView != null ? aVar.a(recyclerView) : false);
            Float a12 = aVar.a(a10, SNSMetricElement.LIST_SEPARATOR_HEIGHT);
            if (a11 != null && recyclerView != null) {
                Float a13 = aVar.a(a10, SNSMetricElement.LIST_SEPARATOR_MARGIN_LEFT);
                float floatValue = a13 != null ? a13.floatValue() : 0.0f;
                Float a14 = aVar.a(a10, SNSMetricElement.LIST_SEPARATOR_MARGIN_RIGHT);
                recyclerView.addItemDecoration(new com.sumsub.sns.core.presentation.base.adapter.decorator.a(floatValue, a14 != null ? a14.floatValue() : 0.0f, a12 != null ? a12.floatValue() : i.a(1), a11.intValue()));
            }
            Integer a15 = aVar.a(a10, SNSColorElement.FIELD_PLACEHOLDER, recyclerView != null ? aVar.a(recyclerView) : false);
            if (a15 != null) {
                int intValue = a15.intValue();
                if (textInputLayout != null && (editText2 = textInputLayout.getEditText()) != null) {
                    editText2.setHintTextColor(intValue);
                }
            }
            if (textInputLayout == null || (editText = textInputLayout.getEditText()) == null) {
                return;
            }
            aVar.a(editText, SNSTypographyElement.SUBTITLE2, SNSColorElement.FIELD_CONTENT);
        }
    }

    public final void setPickerCallBack(PickerCallBack pickerCallBack) {
        this.pickerCallBack = pickerCallBack;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$PickerCallBack;", "", "Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;", "item", "LO9/p;", "onItemSelected", "(Lcom/sumsub/sns/core/widget/autocompletePhone/bottomsheet/SNSPickerDialog$Item;)V", "onDismiss", "()V", "onDialogClose", "onCancel", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public interface PickerCallBack {
        void onItemSelected(Item item);

        default void onCancel() {
        }

        default void onDialogClose() {
        }

        default void onDismiss() {
        }
    }
}
