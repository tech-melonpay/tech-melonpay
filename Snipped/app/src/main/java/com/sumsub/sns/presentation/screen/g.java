package com.sumsub.sns.presentation.screen;

import P9.s;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.data.model.Document;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class g {
    public static final List<Document> a(List<Document> list, com.sumsub.sns.internal.core.data.model.g gVar) {
        List<String> j10;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Document document = (Document) obj;
            if (gVar.I().k() && ((j10 = gVar.I().j()) == null || !j10.contains(document.getType().c()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Document document2 = (Document) next;
            if (!document2.isSubmitted() || document2.isRejected()) {
                arrayList2.add(next);
            }
        }
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(d.f19715L), "moveToNextStep: total docs " + list.size() + ", videoIdent docs left " + arrayList2.size(), null, 4, null);
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        return null;
    }

    public static final Document b(List<Document> list, com.sumsub.sns.internal.core.data.model.g gVar) {
        List<String> j10;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Document document = (Document) obj;
            if (!gVar.I().k() || ((j10 = gVar.I().j()) != null && j10.contains(document.getType().c()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Document document2 = (Document) next;
            if (!document2.isSubmitted() || document2.isRejected()) {
                arrayList2.add(next);
            }
        }
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(d.f19715L), "moveToNextStep: total docs " + list.size() + ", docs left " + arrayList2.size(), null, 4, null);
        return (Document) s.L(arrayList2);
    }
}
