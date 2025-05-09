package com.chuckerteam.chucker.internal.support;

import Ka.y;
import android.content.ContentResolver;
import android.net.Uri;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FileSaver.kt */
/* loaded from: classes.dex */
public final class a {
    public static Object a(y yVar, T9.a aVar, ContentResolver contentResolver, Uri uri) {
        return BuildersKt.withContext(Dispatchers.getIO(), new FileSaver$saveFile$2(yVar, null, contentResolver, uri), aVar);
    }
}
