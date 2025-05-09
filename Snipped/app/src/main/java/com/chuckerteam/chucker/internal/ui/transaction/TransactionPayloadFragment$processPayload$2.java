package com.chuckerteam.chucker.internal.ui.transaction;

import O9.p;
import android.graphics.Bitmap;
import android.text.Html;
import android.text.SpannableStringBuilder;
import ca.InterfaceC0650p;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.BitmapUtilsKt;
import com.chuckerteam.chucker.internal.ui.transaction.d;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ka.C0958c;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransactionPayloadFragment.kt */
@V9.d(c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$processPayload$2", f = "TransactionPayloadFragment.kt", l = {435}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/chuckerteam/chucker/internal/ui/transaction/d;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes.dex */
final class TransactionPayloadFragment$processPayload$2 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super List<d>>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ TransactionPayloadFragment f8758A;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f8759u;

    /* renamed from: v, reason: collision with root package name */
    public Bitmap f8760v;

    /* renamed from: w, reason: collision with root package name */
    public int f8761w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PayloadType f8762x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ HttpTransaction f8763y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f8764z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayloadFragment$processPayload$2(PayloadType payloadType, HttpTransaction httpTransaction, boolean z10, TransactionPayloadFragment transactionPayloadFragment, T9.a<? super TransactionPayloadFragment$processPayload$2> aVar) {
        super(2, aVar);
        this.f8762x = payloadType;
        this.f8763y = httpTransaction;
        this.f8764z = z10;
        this.f8758A = transactionPayloadFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<p> create(Object obj, T9.a<?> aVar) {
        return new TransactionPayloadFragment$processPayload$2(this.f8762x, this.f8763y, this.f8764z, this.f8758A, aVar);
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super List<d>> aVar) {
        return ((TransactionPayloadFragment$processPayload$2) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String responseHeadersString;
        boolean isResponseBodyEncoded;
        CharSequence spannedResponseBody;
        List list;
        ArrayList arrayList;
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f8761w;
        if (i == 0) {
            kotlin.b.b(obj);
            ArrayList arrayList2 = new ArrayList();
            PayloadType payloadType = PayloadType.f8711a;
            PayloadType payloadType2 = this.f8762x;
            TransactionPayloadFragment transactionPayloadFragment = this.f8758A;
            HttpTransaction httpTransaction = this.f8763y;
            if (payloadType2 == payloadType) {
                responseHeadersString = httpTransaction.getRequestHeadersString(true);
                isResponseBodyEncoded = httpTransaction.getIsRequestBodyEncoded();
                if (this.f8764z) {
                    spannedResponseBody = httpTransaction.getSpannedRequestBody(transactionPayloadFragment.getContext());
                } else {
                    spannedResponseBody = httpTransaction.getRequestBody();
                    if (spannedResponseBody == null) {
                        spannedResponseBody = "";
                    }
                }
            } else {
                responseHeadersString = httpTransaction.getResponseHeadersString(true);
                isResponseBodyEncoded = httpTransaction.getIsResponseBodyEncoded();
                spannedResponseBody = httpTransaction.getSpannedResponseBody(transactionPayloadFragment.getContext());
            }
            if (!C0969n.i0(responseHeadersString)) {
                arrayList2.add(new d.c(Html.fromHtml(responseHeadersString, 0)));
            }
            Bitmap responseImageBitmap = httpTransaction.getResponseImageBitmap();
            if (payloadType2 != PayloadType.f8712b || responseImageBitmap == null) {
                if (isResponseBodyEncoded) {
                    arrayList2.add(new d.a(SpannableStringBuilder.valueOf(transactionPayloadFragment.requireContext().getString(R.string.chucker_body_omitted))));
                } else if (C0969n.i0(spannedResponseBody)) {
                    arrayList2.add(new d.a(SpannableStringBuilder.valueOf(transactionPayloadFragment.requireContext().getString(R.string.chucker_body_empty))));
                } else {
                    transactionPayloadFragment.getString(R.string.chucker_copy_response);
                    arrayList2.add(new d.b());
                    C0958c c0958c = new C0958c(spannedResponseBody);
                    if (c0958c.hasNext()) {
                        Object next = c0958c.next();
                        if (c0958c.hasNext()) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(next);
                            while (c0958c.hasNext()) {
                                arrayList3.add(c0958c.next());
                            }
                            list = arrayList3;
                        } else {
                            list = Collections.singletonList(next);
                        }
                    } else {
                        list = EmptyList.f23104a;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = list.size();
                    int i9 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList4.add(spannedResponseBody.subSequence(i9, ((String) list.get(i10)).length() + i9));
                        i9 += ((String) list.get(i10)).length() + 1;
                    }
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(spannedResponseBody.subSequence(0, spannedResponseBody.length()));
                    }
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        CharSequence charSequence = (CharSequence) it.next();
                        arrayList2.add(new d.a(charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : SpannableStringBuilder.valueOf(charSequence)));
                    }
                    p pVar = p.f3034a;
                }
                return arrayList2;
            }
            this.f8759u = arrayList2;
            this.f8760v = responseImageBitmap;
            this.f8761w = 1;
            Object a10 = BitmapUtilsKt.a(responseImageBitmap, this);
            if (a10 == coroutineSingletons) {
                return coroutineSingletons;
            }
            arrayList = arrayList2;
            obj = a10;
            bitmap = responseImageBitmap;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = this.f8760v;
            arrayList = this.f8759u;
            kotlin.b.b(obj);
        }
        arrayList.add(new d.C0098d(bitmap, (Double) obj));
        return arrayList;
    }
}
