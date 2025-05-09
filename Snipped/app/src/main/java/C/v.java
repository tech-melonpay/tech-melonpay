package C;

import android.os.Bundle;
import androidx.navigation.NavController;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.google.android.material.textfield.TextInputLayout;
import com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsController;
import com.luminary.business.presentation.ui.fragments.hub.HubController;
import io.sentry.SentryOptions;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import s6.C1215d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements EpoxyModel.SpanSizeOverrideCallback, OnModelBoundListener, SentryOptions.b, TextInputLayout.e {
    public static int a(int i, float f10, int i9) {
        return (Float.hashCode(f10) + i) * i9;
    }

    public static int b(int i, int i9, int i10) {
        return (Integer.hashCode(i) + i9) * i10;
    }

    public static int c(int i, int i9, String str) {
        return (str.hashCode() + i) * i9;
    }

    public static int d(int i, int i9, boolean z10) {
        return (Boolean.hashCode(z10) + i) * i9;
    }

    public static int e(long j10, int i, int i9) {
        return (Long.hashCode(j10) + i) * i9;
    }

    public static int f(List list, int i, int i9) {
        return (list.hashCode() + i) * i9;
    }

    public static Bundle g(NavController navController) {
        navController.getClass();
        return new Bundle();
    }

    public static Bundle h(NavController navController, String str, boolean z10, String str2, String str3) {
        navController.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        bundle.putString(str2, str3);
        return bundle;
    }

    public static Bundle i(String str, String str2, String str3, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z10);
        bundle.putString(str2, str3);
        return bundle;
    }

    public static String j(int i, int i9, String str) {
        return str.substring(i9, str.length() - i);
    }

    public static String k(int i, int i9, String str, String str2) {
        return str + i + str2 + i9;
    }

    public static String l(Exception exc, StringBuilder sb2) {
        sb2.append(exc.getMessage());
        return sb2.toString();
    }

    public static String m(String str, IOException iOException) {
        return str + iOException;
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, char c2) {
        return str + str2 + c2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(StringBuilder sb2, String str, char c2) {
        sb2.append(str);
        sb2.append(c2);
        return sb2.toString();
    }

    public static String r(StringBuilder sb2, List list, char c2) {
        sb2.append(list);
        sb2.append(c2);
        return sb2.toString();
    }

    public static StringBuilder s(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static MutablePropertyReference1Impl t(Class cls, String str, String str2, int i, kotlin.jvm.internal.i iVar) {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(cls, str, str2, i);
        iVar.getClass();
        return mutablePropertyReference1Impl;
    }

    public static ASN1EncodableVector u(ASN1EncodableVector aSN1EncodableVector, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        return new ASN1EncodableVector();
    }

    public static SingleInstanceFactory v(BeanDefinition beanDefinition, fb.a aVar) {
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        aVar.a(singleInstanceFactory);
        return singleInstanceFactory;
    }

    public static void w(NavController navController, int i) {
        Bundle bundle = new Bundle();
        navController.getClass();
        navController.i(i, bundle);
    }

    public static void x(StringBuilder sb2, String str, String str2, int i, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i);
        sb2.append(str3);
    }

    public static boolean y(Bundle bundle, Class cls, String str) {
        bundle.setClassLoader(cls.getClassLoader());
        return bundle.containsKey(str);
    }

    @Override // com.airbnb.epoxy.EpoxyModel.SpanSizeOverrideCallback
    public int getSpanSize(int i, int i9, int i10) {
        int buildModels$lambda$3$lambda$2$lambda$1;
        buildModels$lambda$3$lambda$2$lambda$1 = HubController.buildModels$lambda$3$lambda$2$lambda$1(i, i9, i10);
        return buildModels$lambda$3$lambda$2$lambda$1;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void onModelBound(EpoxyModel epoxyModel, Object obj, int i) {
        AccountDetailsController.buildModels$lambda$10$lambda$6$lambda$5((C1215d) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
    }
}
