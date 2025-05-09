package androidx.navigation;

import U0.o;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.Navigator;
import ca.InterfaceC0646l;
import ja.l;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.C0967l;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* compiled from: ActivityNavigator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$a;", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@Navigator.b("activity")
/* loaded from: classes.dex */
public class ActivityNavigator extends Navigator<a> {

    /* renamed from: c, reason: collision with root package name */
    public final Context f7127c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f7128d;

    /* compiled from: ActivityNavigator.kt */
    public static class a extends c {

        /* renamed from: l, reason: collision with root package name */
        public Intent f7129l;

        /* renamed from: m, reason: collision with root package name */
        public String f7130m;

        public a() {
            throw null;
        }

        @Override // androidx.navigation.c
        public final boolean equals(Object obj) {
            Intent intent;
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            return super.equals(obj) && ((intent = this.f7129l) == null ? ((a) obj).f7129l == null : intent.filterEquals(((a) obj).f7129l)) && kotlin.jvm.internal.f.b(this.f7130m, ((a) obj).f7130m);
        }

        @Override // androidx.navigation.c
        public final void g(Context context, AttributeSet attributeSet) {
            super.g(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, o.f3632a);
            String string = obtainAttributes.getString(4);
            String X = string != null ? C0967l.X(string, "${applicationId}", context.getPackageName(), false) : null;
            if (this.f7129l == null) {
                this.f7129l = new Intent();
            }
            this.f7129l.setPackage(X);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f7129l == null) {
                    this.f7129l = new Intent();
                }
                this.f7129l.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.f7129l == null) {
                this.f7129l = new Intent();
            }
            this.f7129l.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            String X10 = string4 != null ? C0967l.X(string4, "${applicationId}", context.getPackageName(), false) : null;
            if (X10 != null) {
                Uri parse = Uri.parse(X10);
                if (this.f7129l == null) {
                    this.f7129l = new Intent();
                }
                this.f7129l.setData(parse);
            }
            String string5 = obtainAttributes.getString(3);
            this.f7130m = string5 != null ? C0967l.X(string5, "${applicationId}", context.getPackageName(), false) : null;
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.c
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f7129l;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f7130m;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.c
        public final String toString() {
            Intent intent = this.f7129l;
            ComponentName component = intent != null ? intent.getComponent() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (component != null) {
                sb2.append(" class=");
                sb2.append(component.getClassName());
            } else {
                Intent intent2 = this.f7129l;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    sb2.append(" action=");
                    sb2.append(action);
                }
            }
            return sb2.toString();
        }
    }

    /* compiled from: ActivityNavigator.kt */
    public static final class b implements Navigator.a {
    }

    public ActivityNavigator(Context context) {
        Object obj;
        this.f7127c = context;
        Iterator it = l.d(new InterfaceC0646l<Context, Context>() { // from class: androidx.navigation.ActivityNavigator$hostActivity$1
            @Override // ca.InterfaceC0646l
            public final Context invoke(Context context2) {
                Context context3 = context2;
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            }
        }, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f7128d = (Activity) obj;
    }

    @Override // androidx.navigation.Navigator
    public final a a() {
        return new a(this);
    }

    @Override // androidx.navigation.Navigator
    public final c c(a aVar, Bundle bundle, g gVar, Navigator.a aVar2) {
        Intent intent;
        int intExtra;
        a aVar3 = aVar;
        if (aVar3.f7129l == null) {
            throw new IllegalStateException(s3.b.m(new StringBuilder("Destination "), aVar3.f7267h, " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(aVar3.f7129l);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = aVar3.f7130m;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z10 = aVar2 instanceof b;
        if (z10) {
            ((b) aVar2).getClass();
            intent2.addFlags(0);
        }
        Activity activity = this.f7128d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (gVar != null && gVar.f7313a) {
            intent2.addFlags(PKIFailureInfo.duplicateCertReq);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar3.f7267h);
        Context context = this.f7127c;
        Resources resources = context.getResources();
        if (gVar != null) {
            int i = gVar.f7320h;
            int i9 = gVar.i;
            if ((i <= 0 || !kotlin.jvm.internal.f.b(resources.getResourceTypeName(i), "animator")) && (i9 <= 0 || !kotlin.jvm.internal.f.b(resources.getResourceTypeName(i9), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i9);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i9) + " when launching " + aVar3);
            }
        }
        if (z10) {
            ((b) aVar2).getClass();
            context.startActivity(intent2);
        } else {
            context.startActivity(intent2);
        }
        if (gVar == null || activity == null) {
            return null;
        }
        int i10 = gVar.f7318f;
        int i11 = gVar.f7319g;
        if ((i10 <= 0 || !kotlin.jvm.internal.f.b(resources.getResourceTypeName(i10), "animator")) && (i11 <= 0 || !kotlin.jvm.internal.f.b(resources.getResourceTypeName(i11), "animator"))) {
            if (i10 < 0 && i11 < 0) {
                return null;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            activity.overridePendingTransition(i10, i11 >= 0 ? i11 : 0);
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i10) + " and exit resource " + resources.getResourceName(i11) + "when launching " + aVar3);
        return null;
    }

    @Override // androidx.navigation.Navigator
    public final boolean j() {
        Activity activity = this.f7128d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
