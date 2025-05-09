package com.sumsub.sns.internal.core.data.model;

import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.internal.core.data.model.Document;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class k {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15516a;

        static {
            int[] iArr = new int[ReviewStatusType.values().length];
            iArr[ReviewStatusType.Init.ordinal()] = 1;
            iArr[ReviewStatusType.Queued.ordinal()] = 2;
            iArr[ReviewStatusType.Pending.ordinal()] = 3;
            iArr[ReviewStatusType.Prechecked.ordinal()] = 4;
            iArr[ReviewStatusType.Completed.ordinal()] = 5;
            iArr[ReviewStatusType.Unknown.ordinal()] = 6;
            f15516a = iArr;
        }
    }

    public static final SNSSDKState a(g gVar, List<Document> list) {
        Document.b.C0198b j10;
        switch (a.f15516a[gVar.K().ordinal()]) {
            case 1:
                if (list.isEmpty()) {
                    return SNSSDKState.Failed.ApplicantMisconfigured.INSTANCE;
                }
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Document) it.next()).getResult() != null) {
                            if (!list.isEmpty()) {
                                Iterator<T> it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((Document) it2.next()).getResult() != null) {
                                            if (!list.isEmpty()) {
                                                Iterator<T> it3 = list.iterator();
                                                while (it3.hasNext()) {
                                                    Document.b result = ((Document) it3.next()).getResult();
                                                    if (((result == null || (j10 = result.j()) == null) ? null : j10.e()) == null) {
                                                        return SNSSDKState.Incomplete.INSTANCE;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (!list.isEmpty()) {
                                Iterator<T> it4 = list.iterator();
                                while (it4.hasNext()) {
                                    if (((Document) it4.next()).getResult() == null) {
                                        return null;
                                    }
                                }
                            }
                            return SNSSDKState.Pending.INSTANCE;
                        }
                    }
                }
                return SNSSDKState.Initial.INSTANCE;
            case 2:
            case 3:
            case 4:
                if (gVar.I().k()) {
                    List<Document> a10 = com.sumsub.sns.internal.core.common.i.a(list, gVar);
                    if (!(a10 instanceof Collection) || !a10.isEmpty()) {
                        Iterator<T> it5 = a10.iterator();
                        while (it5.hasNext()) {
                            if (!((Document) it5.next()).isSubmitted()) {
                                return SNSSDKState.Incomplete.INSTANCE;
                            }
                        }
                    }
                }
                return SNSSDKState.Pending.INSTANCE;
            case 5:
                if (gVar.M()) {
                    return SNSSDKState.Approved.INSTANCE;
                }
                if (gVar.O()) {
                    return SNSSDKState.FinallyRejected.INSTANCE;
                }
                if (gVar.P()) {
                    return SNSSDKState.TemporarilyDeclined.INSTANCE;
                }
                return null;
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
