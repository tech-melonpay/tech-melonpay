package U8;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

/* compiled from: LinkResolverDef.java */
/* loaded from: classes2.dex */
public class d implements c {
    private static Uri parseLink(String str) {
        Uri parse = Uri.parse(str);
        return TextUtils.isEmpty(parse.getScheme()) ? parse.buildUpon().scheme("https").build() : parse;
    }

    @Override // U8.c
    public void resolve(View view, String str) {
        Uri parseLink = parseLink(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", parseLink);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }
}
