package f;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import f.AbstractC0728a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ActivityResultContracts.kt */
/* renamed from: f.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732e extends AbstractC0728a<String[], List<Uri>> {
    @Override // f.AbstractC0728a
    public final Intent createIntent(Context context, String[] strArr) {
        return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
    }

    @Override // f.AbstractC0728a
    public final /* bridge */ /* synthetic */ AbstractC0728a.C0395a<List<Uri>> getSynchronousResult(Context context, String[] strArr) {
        return null;
    }

    @Override // f.AbstractC0728a
    public final List<Uri> parseResult(int i, Intent intent) {
        List<Uri> arrayList;
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                arrayList = EmptyList.f23104a;
            } else {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i9 = 0; i9 < itemCount; i9++) {
                        Uri uri = clipData.getItemAt(i9).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return EmptyList.f23104a;
    }
}
