package com.sumsub.sns.prooface.presentation;

import O9.p;
import R0.a;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSLivenessReason;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.core.widget.SNSLivenessFaceView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.PermissionPayload;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.k0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.AnswerType;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.u;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import com.sumsub.sns.internal.prooface.presentation.b;
import e.AbstractC0704c;
import ia.InterfaceC0840h;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k1.C0930k;
import k1.H;
import k1.J;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@Metadata(d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0017\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002Ã\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0006J#\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\n\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\n\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\n\u0010\u001dJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\n\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\u0006J'\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&0$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b\n\u0010'J\u000f\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b\n\u0010-J\u000f\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u000100H\u0003¢\u0006\u0004\b\n\u00102J3\u0010\n\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002050$2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0002¢\u0006\u0004\b\n\u00108J\u0017\u0010\n\u001a\u00020\u00122\u0006\u00104\u001a\u000203H\u0003¢\u0006\u0004\b\n\u00109J\u000f\u0010:\u001a\u000205H\u0014¢\u0006\u0004\b:\u0010;J+\u0010B\u001a\u00020\t2\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010A\u001a\u0004\u0018\u00010@H\u0014¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00122\u0006\u0010D\u001a\u00020<H\u0016¢\u0006\u0004\bE\u0010FJ!\u0010K\u001a\u00020\t2\u0006\u0010H\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u00020\t2\b\u0010J\u001a\u0004\u0018\u00010IH\u0014¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\t2\u0006\u0010,\u001a\u00020OH\u0014¢\u0006\u0004\bP\u0010QJ!\u0010\n\u001a\u00020\t2\u0006\u0010R\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010IH\u0014¢\u0006\u0004\b\n\u0010SJ\u000f\u0010T\u001a\u00020\tH\u0016¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\tH\u0016¢\u0006\u0004\bU\u0010\u0006J\u000f\u0010V\u001a\u00020\tH\u0016¢\u0006\u0004\bV\u0010\u0006J\u000f\u0010W\u001a\u00020\tH\u0016¢\u0006\u0004\bW\u0010\u0006J\u000f\u0010X\u001a\u00020\tH\u0016¢\u0006\u0004\bX\u0010\u0006J\u0017\u0010Z\u001a\u00020\t2\u0006\u0010,\u001a\u00020YH\u0016¢\u0006\u0004\bZ\u0010[J!\u0010_\u001a\u00020\t2\b\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010^\u001a\u000205H\u0016¢\u0006\u0004\b_\u0010`R\u001b\u0010e\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010k\u001a\u00020f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001d\u0010p\u001a\u0004\u0018\u00010G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001d\u0010t\u001a\u0004\u0018\u00010q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010m\u001a\u0004\br\u0010sR\u001d\u0010x\u001a\u0004\u0018\u00010u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010m\u001a\u0004\bv\u0010wR\u001d\u0010}\u001a\u0004\u0018\u00010y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010m\u001a\u0004\b{\u0010|R\u001e\u0010\u0080\u0001\u001a\u0004\u0018\u00010y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b~\u0010m\u001a\u0004\b\u007f\u0010|R!\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010m\u001a\u0005\bz\u0010\u0083\u0001R!\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\bn\u0010m\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u008a\u0001\u001a\u0004\u0018\u00010y8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010m\u001a\u0005\b\u0089\u0001\u0010|R \u0010\u008d\u0001\u001a\u0004\u0018\u00010y8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010m\u001a\u0005\b\u008c\u0001\u0010|R\u001f\u0010\u008e\u0001\u001a\u0004\u0018\u00010u8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\bv\u0010m\u001a\u0005\b\u008b\u0001\u0010wR \u0010\u0090\u0001\u001a\u0004\u0018\u00010y8TX\u0094\u0084\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010m\u001a\u0005\b\u008f\u0001\u0010|R!\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010m\u001a\u0005\b~\u0010\u0092\u0001R\u0017\u0010\u0096\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0095\u0001R\u0018\u0010\u0098\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\br\u0010\u0097\u0001R\u0018\u0010\u009b\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bc\u0010\u009a\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001b\u0010 \u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000f\u0010\u009f\u0001R\u001b\u0010¡\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010\u009f\u0001R\u001b\u0010¤\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b/\u0010£\u0001R\u001a\u0010¦\u0001\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010¥\u0001R\u0018\u0010§\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010\u009a\u0001R\u0018\u0010¨\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u009a\u0001R\u0016\u0010©\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u009a\u0001R\u0017\u0010«\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010\u009a\u0001R)\u0010¯\u0001\u001a\u0012\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00110\u00ad\u0001\u0018\u00010¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010®\u0001R\u001b\u0010²\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0017\u0010´\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010³\u0001R#\u0010·\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020>0\u00108BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0017\u0010º\u0001\u001a\u00020\u00118TX\u0094\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R#\u0010¼\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020>0\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010¶\u0001R#\u0010¾\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020>0\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¶\u0001R#\u0010À\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020>0\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010¶\u0001R#\u0010Â\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020>0\u00108VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010¶\u0001¨\u0006Ä\u0001"}, d2 = {"Lcom/sumsub/sns/prooface/presentation/SNSLiveness3dFaceFragment;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/prooface/presentation/b$i;", "Lcom/sumsub/sns/internal/prooface/presentation/b;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "Lcom/sumsub/sns/internal/core/data/model/u$b;", "finishEvent", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/data/model/u$b;)V", "Lcom/sumsub/sns/internal/core/data/model/u$c;", "result", "(Lcom/sumsub/sns/internal/core/data/model/u$c;)V", "A", "", "", "", "grantResults", "handlePermissionResults", "(Ljava/util/Map;)V", "Lcom/sumsub/sns/internal/prooface/presentation/b$f;", "status", "(Lcom/sumsub/sns/internal/prooface/presentation/b$f;)V", "F", "l", "Landroid/graphics/RectF;", "faceBox", "(Landroid/graphics/RectF;)Landroid/graphics/RectF;", "Lcom/sumsub/sns/internal/prooface/presentation/b$g$f;", "(Lcom/sumsub/sns/internal/prooface/presentation/b$g$f;)V", "E", "G", "Lcom/sumsub/sns/prooface/data/j;", "session", "Lkotlin/Pair;", "Landroid/graphics/drawable/Drawable;", "Lcom/sumsub/sns/internal/core/widget/SNSStepState;", "(Lcom/sumsub/sns/prooface/data/j;)Lkotlin/Pair;", "z", "D", "k", "Lcom/sumsub/sns/core/presentation/base/a$n;", "event", "(Lcom/sumsub/sns/core/presentation/base/a$n;)V", "B", "C", "Lcom/sumsub/sns/internal/prooface/presentation/b$j;", "dialog", "(Lcom/sumsub/sns/internal/prooface/presentation/b$j;)V", "Landroid/content/Context;", "context", "", "screenBrightnessMode", "screenBrightnessValue", "(Landroid/content/Context;II)Lkotlin/Pair;", "(Landroid/content/Context;)Z", "getLayoutId", "()I", "Lcom/sumsub/sns/internal/core/common/q;", "reason", "", "payload", "", "delay", "finish", "(Lcom/sumsub/sns/internal/core/common/q;Ljava/lang/Object;Ljava/lang/Long;)V", "finishReason", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/a$j;", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "state", "(Lcom/sumsub/sns/internal/prooface/presentation/b$i;Landroid/os/Bundle;)V", "onStart", "onDestroyView", "onStop", "onResume", "onPause", "Landroid/hardware/SensorEvent;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "h", "LO9/f;", "y", "()Lcom/sumsub/sns/internal/prooface/presentation/b;", "viewModel", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "i", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "j", "Lcom/sumsub/sns/internal/core/common/z;", "p", "()Landroid/view/View;", FirebaseAnalytics.Param.CONTENT, "Landroid/view/ViewGroup;", "x", "()Landroid/view/ViewGroup;", "vgResult", "Landroid/widget/ImageView;", "s", "()Landroid/widget/ImageView;", "ivIcon", "Landroid/widget/TextView;", "m", "w", "()Landroid/widget/TextView;", "tvTitle", "n", "v", "tvSubTitle", "Landroid/widget/Button;", "o", "()Landroid/widget/Button;", "btnTryAgain", "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;", "q", "()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;", "faceView", "u", "tvHint", "r", "t", "tvDebug", "ivCompleteImage", "getPoweredByText", "poweredByText", "Landroidx/camera/view/PreviewView;", "()Landroidx/camera/view/PreviewView;", "cameraView", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX;", "Lcom/sumsub/sns/internal/core/domain/camera/CameraX;", "cameraX", "I", "brightnessMode", "brightnessValue", "Z", "needRestoreBrightness", "", "illumination", "Landroidx/appcompat/app/b;", "Landroidx/appcompat/app/b;", "lackOfPermissionDialog", "writeSettingDialog", "Landroid/hardware/SensorManager;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/Sensor;", "lightSensor", "isLivenessStarted", "writeSettingDialogShown", "isDebug", "H", "allowSettingsDialog", "Le/c;", "", "Le/c;", "permissionLauncher", "J", "Lcom/sumsub/sns/internal/prooface/presentation/b$f;", "previousFaceDetectorStatus", "()Landroid/graphics/RectF;", "capturingBox", "getPermissionsPayload", "()Ljava/util/Map;", "permissionsPayload", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "getOpenPayload", "openPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "getAppearPayload", "appearPayload", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSLiveness3dFaceFragment extends com.sumsub.sns.core.presentation.b<b.i, com.sumsub.sns.internal.prooface.presentation.b> implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f20286b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f20287c;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public androidx.appcompat.app.b lackOfPermissionDialog;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public androidx.appcompat.app.b writeSettingDialog;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public SensorManager sensorManager;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public Sensor lightSensor;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public boolean isLivenessStarted;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public boolean writeSettingDialogShown;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public final boolean isDebug;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public final boolean allowSettingsDialog;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public AbstractC0704c<String[]> permissionLauncher;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public b.f previousFaceDetectorStatus;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: i, reason: from kotlin metadata */
    public final Screen screen;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final z content;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final z vgResult;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final z ivIcon;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final z tvTitle;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final z tvSubTitle;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final z btnTryAgain;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final z faceView;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final z tvHint;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final z tvDebug;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final z ivCompleteImage;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final z poweredByText;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final z cameraView;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final CameraX cameraX;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int brightnessMode;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int brightnessValue;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public boolean needRestoreBrightness;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public float illumination;

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/sumsub/sns/prooface/presentation/SNSLiveness3dFaceFragment$Companion;", "", "()V", "MINIMUM_LIGHT", "", "OPTIMAL_IMAGE_HEIGHT", "OPTIMAL_IMAGE_WIDTH", "REQUIRED_PERMISSIONS", "", "", "[Ljava/lang/String;", "RESULT_DELAY", "", "newInstance", "Landroidx/fragment/app/Fragment;", "documentType", "Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Keep
        public final Fragment newInstance(DocumentType documentType) {
            SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment = new SNSLiveness3dFaceFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_ID_DOC_SET_TYPE", documentType.c());
            sNSLiveness3dFaceFragment.setArguments(bundle);
            return sNSLiveness3dFaceFragment;
        }

        private Companion() {
        }
    }

    public static final class a implements com.sumsub.sns.internal.core.domain.camera.a {
        public a() {
        }

        @Override // com.sumsub.sns.internal.core.domain.camera.a
        public Object a(ImageProxy imageProxy, com.sumsub.sns.internal.core.domain.camera.c cVar, T9.a<? super p> aVar) {
            SNSLiveness3dFaceFragment.this.getViewModel().a(imageProxy, SNSLiveness3dFaceFragment.this.o(), cVar.d());
            return p.f3034a;
        }

        @Override // com.sumsub.sns.internal.core.domain.camera.a
        public void c() {
            com.sumsub.sns.prooface.a.a("Prooface", "onPreviewReady()", null, 4, null);
            SNSLiveness3dFaceFragment.this.E();
            SNSLivenessFaceView q10 = SNSLiveness3dFaceFragment.this.q();
            if (q10 != null) {
                q10.setVisibility(0);
            }
            SNSLiveness3dFaceFragment.this.C();
        }

        @Override // com.sumsub.sns.internal.core.domain.camera.a
        public void onError(Exception exc) {
            SNSLiveness3dFaceFragment.this.getViewModel().a(exc);
        }
    }

    @V9.d(c = "com.sumsub.sns.prooface.presentation.SNSLiveness3dFaceFragment$onViewModelPrepared$1", f = "SNSLiveness3dFaceFragment.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<b.f, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20317a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20318b;

        public b(T9.a<? super b> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b.f fVar, T9.a<? super p> aVar) {
            return ((b) create(fVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            b bVar = SNSLiveness3dFaceFragment.this.new b(aVar);
            bVar.f20318b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f20317a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b.f fVar = (b.f) this.f20318b;
            if (fVar != null) {
                SNSLiveness3dFaceFragment.this.a(fVar);
            }
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.prooface.presentation.SNSLiveness3dFaceFragment$onViewModelPrepared$2", f = "SNSLiveness3dFaceFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<b.g, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20320a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20321b;

        public c(T9.a<? super c> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b.g gVar, T9.a<? super p> aVar) {
            return ((c) create(gVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            c cVar = SNSLiveness3dFaceFragment.this.new c(aVar);
            cVar.f20321b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ImageView r8;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f20320a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b.g gVar = (b.g) this.f20321b;
            com.sumsub.sns.prooface.a.a("Prooface", "livenessResult: " + gVar, null, 4, null);
            if (!(gVar instanceof b.g.e)) {
                if (gVar instanceof b.g.f) {
                    SNSLiveness3dFaceFragment.this.a((b.g.f) gVar);
                } else if (gVar instanceof b.g.C0356g) {
                    View view = SNSLiveness3dFaceFragment.this.getView();
                    View findViewById = view != null ? view.findViewById(R$id.sns_camera) : null;
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    TextView u6 = SNSLiveness3dFaceFragment.this.u();
                    if (u6 != null) {
                        u6.setText(((b.g.C0356g) gVar).d());
                    }
                    SNSLivenessFaceView q10 = SNSLiveness3dFaceFragment.this.q();
                    if (q10 != null) {
                        q10.setRecognizingState();
                    }
                    ImageView r10 = SNSLiveness3dFaceFragment.this.r();
                    if (r10 != null) {
                        r10.setVisibility(8);
                    }
                    if (((b.g.C0356g) gVar).c()) {
                        com.sumsub.sns.internal.core.domain.camera.c f10 = SNSLiveness3dFaceFragment.this.cameraX.f();
                        SNSLiveness3dFaceFragment.this.getViewModel().a(f10.d(), f10.f(), f10.e());
                    }
                } else if (gVar instanceof b.g.d) {
                    TextView u10 = SNSLiveness3dFaceFragment.this.u();
                    if (u10 != null) {
                        u10.setText(((b.g.d) gVar).b());
                    }
                } else if (gVar instanceof b.g.C0355b) {
                    J j10 = new J();
                    C0930k c0930k = new C0930k(1);
                    j10.T(c0930k);
                    C0930k c0930k2 = new C0930k(2);
                    c0930k2.f22694b = c0930k.f22695c;
                    j10.T(c0930k2);
                    H.a((ViewGroup) SNSLiveness3dFaceFragment.this.requireView().findViewById(R$id.sns_overlay), j10);
                    TextView u11 = SNSLiveness3dFaceFragment.this.u();
                    if (u11 != null) {
                        u11.setText(((b.g.C0355b) gVar).d());
                    }
                    SNSLiveness3dFaceFragment.this.G();
                    SNSLivenessFaceView q11 = SNSLiveness3dFaceFragment.this.q();
                    if (q11 != null) {
                        q11.setFaceAnalyzingState();
                    }
                    ImageView r11 = SNSLiveness3dFaceFragment.this.r();
                    if ((r11 == null || r11.getVisibility() != 0) && (r8 = SNSLiveness3dFaceFragment.this.r()) != null) {
                        r8.setImageBitmap(((b.g.C0355b) gVar).c());
                        r8.setVisibility(0);
                        r8.setAlpha(0.0f);
                        r8.animate().alpha(1.0f).setDuration(r8.getResources().getInteger(R.integer.config_shortAnimTime)).start();
                    }
                } else if (gVar instanceof b.g.a) {
                    String a10 = com.sumsub.sns.internal.log.c.a(SNSLiveness3dFaceFragment.this);
                    StringBuilder sb2 = new StringBuilder("Calibrate, set exposure = ");
                    b.g.a aVar = (b.g.a) gVar;
                    sb2.append(aVar.b());
                    com.sumsub.sns.prooface.a.a(a10, sb2.toString(), null, 4, null);
                    SNSLiveness3dFaceFragment.this.cameraX.a(aVar.b());
                } else if (gVar instanceof b.g.c) {
                    String a11 = com.sumsub.sns.internal.log.c.a(SNSLiveness3dFaceFragment.this);
                    StringBuilder sb3 = new StringBuilder("Calibrate, set exposure = ");
                    b.g.c cVar = (b.g.c) gVar;
                    sb3.append(cVar.b());
                    com.sumsub.sns.prooface.a.a(a11, sb3.toString(), null, 4, null);
                    SNSLiveness3dFaceFragment.this.cameraX.a(cVar.b());
                    SNSLiveness3dFaceFragment.this.getViewModel().E();
                }
            }
            return p.f3034a;
        }
    }

    public static final class d implements SNSLivenessFaceView.SNSFaceStateListener {
        public d() {
        }

        @Override // com.sumsub.sns.core.widget.SNSLivenessFaceView.SNSFaceStateListener
        public void onState(SNSLivenessFaceView.SNSFaceViewState sNSFaceViewState) {
            SNSLiveness3dFaceFragment.this.getViewModel().d(sNSFaceViewState == SNSLivenessFaceView.SNSFaceViewState.Recognized);
            if (sNSFaceViewState == SNSLivenessFaceView.SNSFaceViewState.Complete) {
                SNSLiveness3dFaceFragment.this.k();
            }
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<p> {
        public e() {
            super(0);
        }

        public final void a() {
            SNSLiveness3dFaceFragment.this.lackOfPermissionDialog = null;
            SNSLiveness3dFaceFragment.this.getViewModel().A();
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.prooface.presentation.SNSLiveness3dFaceFragment$showResult$1", f = "SNSLiveness3dFaceFragment.kt", l = {488}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20325a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.prooface.data.j f20327c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.sumsub.sns.prooface.data.j jVar, T9.a<? super f> aVar) {
            super(2, aVar);
            this.f20327c = jVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((f) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return SNSLiveness3dFaceFragment.this.new f(this.f20327c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f20325a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.f20325a = 1;
                if (DelayKt.delay(2000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            ViewGroup x9 = SNSLiveness3dFaceFragment.this.x();
            if (x9 != null) {
                x9.setVisibility(8);
            }
            com.sumsub.sns.internal.prooface.presentation.b viewModel = SNSLiveness3dFaceFragment.this.getViewModel();
            Boolean allowContinuing = this.f20327c.getAllowContinuing();
            viewModel.a(allowContinuing != null ? allowContinuing.booleanValue() : false, this.f20327c.getAnswer());
            return p.f3034a;
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f20328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f20328a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f20328a;
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20329a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f20329a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f20329a.invoke();
        }
    }

    public static final class i extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f20330a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(O9.f fVar) {
            super(0);
            this.f20330a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f20330a.getValue()).getViewModelStore();
        }
    }

    public static final class j extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20331a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f20332b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f20331a = interfaceC0635a;
            this.f20332b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f20331a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f20332b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class l extends Lambda implements InterfaceC0635a<T> {
        public l() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment = SNSLiveness3dFaceFragment.this;
            return new com.sumsub.sns.internal.prooface.presentation.c(sNSLiveness3dFaceFragment, sNSLiveness3dFaceFragment.getServiceLocator(), SNSLiveness3dFaceFragment.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SNSLiveness3dFaceFragment.class, FirebaseAnalytics.Param.CONTENT, "getContent()Landroid/view/View;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        f20286b = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, SNSLiveness3dFaceFragment.class, "vgResult", "getVgResult()Landroid/view/ViewGroup;", 0), com.google.android.gms.measurement.internal.a.o(SNSLiveness3dFaceFragment.class, "ivIcon", "getIvIcon()Landroid/widget/ImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(SNSLiveness3dFaceFragment.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(SNSLiveness3dFaceFragment.class, "tvSubTitle", "getTvSubTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(SNSLiveness3dFaceFragment.class, "btnTryAgain", "getBtnTryAgain()Landroid/widget/Button;", 0, iVar), com.google.android.gms.measurement.internal.a.o(SNSLiveness3dFaceFragment.class, "faceView", "getFaceView()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(SNSLiveness3dFaceFragment.class, "tvHint", "getTvHint()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(SNSLiveness3dFaceFragment.class, "tvDebug", "getTvDebug()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(SNSLiveness3dFaceFragment.class, "ivCompleteImage", "getIvCompleteImage()Landroid/widget/ImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(SNSLiveness3dFaceFragment.class, "poweredByText", "getPoweredByText()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(SNSLiveness3dFaceFragment.class, "cameraView", "getCameraView()Landroidx/camera/view/PreviewView;", 0, iVar)};
        INSTANCE = new Companion(null);
        f20287c = new String[]{"android.permission.CAMERA"};
    }

    public SNSLiveness3dFaceFragment() {
        l lVar = new l();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new h(new g(this)));
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(com.sumsub.sns.internal.prooface.presentation.b.class), new i(b9), lVar, new j(null, b9));
        this.screen = Screen.LivenessScreen;
        this.content = a0.a(this, R$id.sns_content);
        this.vgResult = a0.a(this, R$id.sns_container);
        this.ivIcon = a0.a(this, R$id.sns_icon);
        this.tvTitle = a0.a(this, R$id.sns_title);
        this.tvSubTitle = a0.a(this, R$id.sns_subtitle);
        this.btnTryAgain = a0.a(this, R$id.sns_primary_button);
        this.faceView = a0.a(this, R$id.sns_face_view);
        this.tvHint = a0.a(this, R$id.sns_hint);
        this.tvDebug = a0.a(this, R$id.sns_debug);
        this.ivCompleteImage = a0.a(this, R$id.sns_complete_icon);
        this.poweredByText = a0.a(this, R$id.sns_powered);
        this.cameraView = a0.a(this, R$id.sns_camera_preview);
        this.cameraX = new CameraX(CameraX.Mode.ANALYZER, new Size(1280, 720), null, CameraSelector.DEFAULT_FRONT_CAMERA, new a(), 4, null);
        this.brightnessValue = 255;
        this.illumination = Float.MAX_VALUE;
        com.sumsub.sns.internal.ff.a aVar = com.sumsub.sns.internal.ff.a.f16930a;
        this.isDebug = aVar.o().g();
        this.allowSettingsDialog = aVar.p().g();
    }

    public final void A() {
        com.sumsub.sns.prooface.a.a("Prooface", "Init camera", null, 4, null);
        this.cameraX.a(getViewLifecycleOwner(), n());
    }

    public final void B() {
        if (this.needRestoreBrightness && a(requireContext())) {
            a(requireContext(), this.brightnessMode, this.brightnessValue);
            this.needRestoreBrightness = false;
        }
    }

    public final void C() {
        if (this.illumination >= 10.0f || this.needRestoreBrightness || !a(requireContext())) {
            return;
        }
        Pair<Integer, Integer> a10 = a(requireContext(), 0, 255);
        this.brightnessMode = a10.f23089a.intValue();
        this.brightnessValue = a10.f23090b.intValue();
        this.needRestoreBrightness = true;
    }

    public final void D() {
        SNSLivenessFaceView q10 = q();
        if (q10 != null) {
            q10.setScanCompleteState();
        }
    }

    public final void E() {
        ImageView r8 = r();
        if (r8 != null) {
            r8.setVisibility(8);
        }
        if (getArguments() != null) {
            getViewModel().c("Built-in front camera");
        }
        this.isLivenessStarted = true;
    }

    public final void F() {
        getViewModel().F();
        this.cameraX.g();
    }

    public final void G() {
        this.isLivenessStarted = false;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void finish(q reason, Object payload, Long delay) {
        if (payload instanceof u.b) {
            a((u.b) payload);
        } else if (payload instanceof u.c) {
            a((u.c) payload);
        } else {
            super.finish(reason, payload, delay);
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getAppearPayload() {
        return getPermissionsPayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getCancelPayload() {
        return getPermissionsPayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getClosePayload() {
        return getPermissionsPayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return getViewModel().u().c();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_liveness_3dface;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getOpenPayload() {
        return getPermissionsPayload();
    }

    public final Map<String, Object> getPermissionsPayload() {
        Context context = getContext();
        if (context == null) {
            return kotlin.collections.a.p();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PermissionPayload.CAMERA_PERMISSION.toString(), Boolean.valueOf(com.sumsub.sns.internal.core.common.j.a(context, "android.permission.CAMERA")));
        return linkedHashMap;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public TextView getPoweredByText() {
        return (TextView) this.poweredByText.a(this, f20286b[10]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return this.screen;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        com.sumsub.sns.prooface.a.a("Prooface", "handleEvent: " + event, null, 4, null);
        if (event instanceof a.n) {
            a((a.n) event);
            return;
        }
        if (event instanceof b.e) {
            com.sumsub.sns.prooface.a.a("Prooface", "HandleErrorEvent: " + ((b.e) event).b(), null, 4, null);
            updateShowProgress(true);
            A();
            return;
        }
        if (!(event instanceof a.d)) {
            super.handleEvent(event);
            return;
        }
        F();
        a.d dVar = (a.d) event;
        getBaseActivity().a(dVar.e(), dVar.f(), dVar.d());
    }

    public final void handlePermissionResults(Map<String, Boolean> grantResults) {
        boolean z10;
        boolean z11 = false;
        if (!grantResults.isEmpty()) {
            Iterator<Map.Entry<String, Boolean>> it = grantResults.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().booleanValue()) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        com.sumsub.sns.prooface.a.a("Prooface", "handlePermissionResults: granted=" + z10, null, 4, null);
        if ((!grantResults.isEmpty()) && !grantResults.isEmpty()) {
            Iterator<Map.Entry<String, Boolean>> it2 = grantResults.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!it2.next().getValue().booleanValue()) {
                    String[] strArr = f20287c;
                    int length = strArr.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        if (shouldShowRequestPermissionRationale(strArr[i9])) {
                            z11 = true;
                            break;
                        }
                        i9++;
                    }
                    getViewModel().c(!z11);
                }
            }
        }
        if (z10) {
            A();
        }
    }

    public final void l() {
        String[] strArr = f20287c;
        int length = strArr.length;
        boolean z10 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                z10 = true;
                break;
            }
            if (!com.sumsub.sns.internal.core.common.j.a(requireContext(), strArr[i9])) {
                break;
            } else {
                i9++;
            }
        }
        com.sumsub.sns.prooface.a.a("Prooface", "checkPermissions: granted=" + z10, null, 4, null);
        if (z10) {
            A();
            return;
        }
        AbstractC0704c<String[]> abstractC0704c = this.permissionLauncher;
        if (abstractC0704c != null) {
            abstractC0704c.a(f20287c);
        }
    }

    public final Button m() {
        return (Button) this.btnTryAgain.a(this, f20286b[5]);
    }

    public final PreviewView n() {
        return (PreviewView) this.cameraView.a(this, f20286b[11]);
    }

    public final RectF o() {
        Rect faceCapturingRect = q().getFaceCapturingRect();
        n().getLocationInWindow(new int[2]);
        q().getLocationInWindow(new int[2]);
        return new RectF(((r1[0] - r2[0]) + faceCapturingRect.left) / n().getWidth(), ((r1[1] - r2[1]) + faceCapturingRect.top) / n().getHeight(), ((r1[0] - r2[0]) + faceCapturingRect.right) / n().getWidth(), ((r1[1] - r2[1]) + faceCapturingRect.bottom) / n().getHeight());
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.cameraX.g();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        if (!(finishReason instanceof q.c)) {
            return super.onFinishCalled(finishReason);
        }
        View p10 = p();
        if (p10 != null) {
            p10.setVisibility(4);
        }
        getViewModel().z();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        B();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.registerListener(this, this.lightSensor, 3);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        this.illumination = event.values[0];
        C();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getIsPrepared()) {
            l();
        }
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStop() {
        androidx.appcompat.app.b bVar = this.lackOfPermissionDialog;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.lackOfPermissionDialog = null;
        androidx.appcompat.app.b bVar2 = this.writeSettingDialog;
        if (bVar2 != null) {
            bVar2.dismiss();
        }
        this.writeSettingDialog = null;
        getViewModel().F();
        super.onStop();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.permissionLauncher = registerForActivityResult(new f.f(), new com.sumsub.sns.geo.presentation.d(this, 9));
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void onViewModelPrepared(Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        SNSLivenessFaceView q10 = q();
        if (q10 != null) {
            q10.setVisibility(4);
        }
        SensorManager sensorManager = (SensorManager) requireContext().getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.lightSensor = sensorManager != null ? sensorManager.getDefaultSensor(5) : null;
        b0.b(getViewModel().x(), this, new b(null));
        b0.b(getViewModel().v(), this, new c(null));
        SNSLivenessFaceView q11 = q();
        if (q11 != null) {
            q11.setStateListener(new d());
        }
        TextView t3 = t();
        if (t3 != null) {
            t3.setVisibility(this.isDebug ? 0 : 8);
        }
        l();
    }

    public final View p() {
        return this.content.a(this, f20286b[0]);
    }

    public final SNSLivenessFaceView q() {
        return (SNSLivenessFaceView) this.faceView.a(this, f20286b[6]);
    }

    public final ImageView r() {
        return (ImageView) this.ivCompleteImage.a(this, f20286b[9]);
    }

    public final ImageView s() {
        return (ImageView) this.ivIcon.a(this, f20286b[2]);
    }

    public final TextView t() {
        return (TextView) this.tvDebug.a(this, f20286b[8]);
    }

    public final TextView u() {
        return (TextView) this.tvHint.a(this, f20286b[7]);
    }

    public final TextView v() {
        return (TextView) this.tvSubTitle.a(this, f20286b[4]);
    }

    public final TextView w() {
        return (TextView) this.tvTitle.a(this, f20286b[3]);
    }

    public final ViewGroup x() {
        return (ViewGroup) this.vgResult.a(this, f20286b[1]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.prooface.presentation.b getViewModel() {
        return (com.sumsub.sns.internal.prooface.presentation.b) this.viewModel.getValue();
    }

    public final void z() {
        TextView u6 = u();
        if (u6 != null) {
            u6.setAlpha(0.0f);
            u6.animate().alpha(1.0f).start();
        }
        SNSLivenessFaceView q10 = q();
        if (q10 != null) {
            q10.setRecognizingState();
        }
        ViewGroup x9 = x();
        if (x9 == null) {
            return;
        }
        x9.setVisibility(8);
    }

    public static final void b(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, DialogInterface dialogInterface, int i9) {
        dialogInterface.dismiss();
        sNSLiveness3dFaceFragment.writeSettingDialog = null;
        sNSLiveness3dFaceFragment.getViewModel().B();
    }

    public static final void c(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, DialogInterface dialogInterface, int i9) {
        sNSLiveness3dFaceFragment.writeSettingDialog = null;
        dialogInterface.dismiss();
    }

    public final void k() {
        ViewGroup x9 = x();
        if (x9 == null || x9.getVisibility() != 0) {
            ViewGroup x10 = x();
            if (x10 != null) {
                x10.setVisibility(0);
            }
            ImageView s10 = s();
            if (s10 != null) {
                s10.setScaleX(0.0f);
            }
            H0.e eVar = new H0.e(s(), H0.b.f1384m, 1.0f);
            eVar.f1405s.b(200.0f);
            eVar.f1405s.a(0.75f);
            eVar.g();
            ImageView s11 = s();
            if (s11 != null) {
                s11.setScaleY(0.0f);
            }
            H0.e eVar2 = new H0.e(s(), H0.b.f1385n, 1.0f);
            eVar2.f1405s.b(200.0f);
            eVar2.f1405s.a(0.75f);
            eVar2.g();
            Button m2 = m();
            if (m2 != null && m2.getVisibility() == 0) {
                m2.setAlpha(0.0f);
                m2.animate().alpha(1.0f).start();
            }
            TextView u6 = u();
            if (u6 != null) {
                u6.setAlpha(1.0f);
                u6.animate().alpha(0.0f).start();
            }
            B();
        }
    }

    public final void a(u.b finishEvent) {
        SNSLivenessReason c2 = finishEvent.c();
        if (c2 instanceof SNSLivenessReason.NetworkError) {
            F();
            Exception exception = ((SNSLivenessReason.NetworkError) c2).getException();
            if (exception != null) {
                getViewModel().b(exception);
                return;
            }
            return;
        }
        com.sumsub.sns.core.presentation.b.finish$default(this, new q.d(new SNSCompletionResult.SuccessTermination(c2)), null, null, 6, null);
    }

    public final void a(u.c result) {
        SNSLivenessReason d10 = result.d();
        if (d10 instanceof SNSLivenessReason.VeritifcationSuccessfully) {
            k0 appListener = getAppListener();
            if (appListener != null) {
                appListener.a(result.c());
                return;
            }
            return;
        }
        if (d10 instanceof SNSLivenessReason.CompletedUnsuccessfullyAllowContinue) {
            com.sumsub.sns.core.presentation.b.finish$default(this, new q.b(false, 1, null), null, null, 6, null);
            return;
        }
        if (d10 instanceof SNSLivenessReason.UserCancelled) {
            com.sumsub.sns.core.presentation.b.finish$default(this, q.a.f15160b, null, null, 6, null);
            return;
        }
        if (d10 instanceof SNSLivenessReason.NetworkError) {
            F();
            com.sumsub.sns.internal.prooface.presentation.b viewModel = getViewModel();
            Exception exception = ((SNSLivenessReason.NetworkError) result.d()).getException();
            if (exception == null) {
                exception = new IOException();
            }
            com.sumsub.sns.core.presentation.base.a.a(viewModel, exception, getIdDocSetType(), (Object) null, 4, (Object) null);
            return;
        }
        if (d10 instanceof SNSLivenessReason.InitializationError) {
            F();
            com.sumsub.sns.core.presentation.base.a.a(getViewModel(), ((SNSLivenessReason.InitializationError) result.d()).getException(), getIdDocSetType(), (Object) null, 4, (Object) null);
        } else {
            com.sumsub.sns.core.presentation.b.finish$default(this, q.a.f15160b, null, null, 6, null);
        }
    }

    public static final void a(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, Map map) {
        sNSLiveness3dFaceFragment.handlePermissionResults(map);
    }

    public final void a(b.f status) {
        SNSLivenessFaceView q10;
        SNSLivenessFaceView q11;
        SNSLivenessFaceView q12;
        SNSLivenessFaceView q13;
        b.f fVar = this.previousFaceDetectorStatus;
        b.f fVar2 = (fVar == null || (kotlin.jvm.internal.f.b(kotlin.jvm.internal.h.a(status.getClass()), kotlin.jvm.internal.h.a(fVar.getClass())) ^ true)) ? status : null;
        if (fVar2 != null) {
            com.sumsub.sns.prooface.a.a("Prooface", "face detector status: " + fVar2, null, 4, null);
        }
        this.previousFaceDetectorStatus = status;
        ViewGroup x9 = x();
        if (x9 != null && x9.getVisibility() == 0) {
            SNSLivenessFaceView q14 = q();
            if (q14 != null) {
                q14.setScanCompleteState();
                return;
            }
            return;
        }
        if (this.isLivenessStarted) {
            TextView u6 = u();
            if (u6 != null) {
                u6.setText(status.a());
            }
            if (status instanceof b.f.C0354b) {
                SNSLivenessFaceView q15 = q();
                if (q15 != null) {
                    q15.setRecognizingState();
                }
                if (!this.isDebug || (q13 = q()) == null) {
                    return;
                }
                q13.setFaceRectangle(null);
                return;
            }
            if (status instanceof b.f.c) {
                SNSLivenessFaceView q16 = q();
                if (q16 != null) {
                    q16.setRecognizingState();
                }
                if (!this.isDebug || (q12 = q()) == null) {
                    return;
                }
                q12.setFaceRectangle(a(((b.f.c) status).d()));
                return;
            }
            if (status instanceof b.f.d) {
                SNSLivenessFaceView q17 = q();
                if (q17 != null) {
                    q17.setRecognizingState();
                }
                if (!this.isDebug || (q11 = q()) == null) {
                    return;
                }
                q11.setFaceRectangle(null);
                return;
            }
            if (status instanceof b.f.a) {
                SNSLivenessFaceView q18 = q();
                if (q18 != null) {
                    q18.setFaceDetectedState();
                }
                if (!this.isDebug || (q10 = q()) == null) {
                    return;
                }
                q10.setFaceRectangle(a(((b.f.a) status).d()));
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(b.i state, Bundle savedInstanceState) {
        com.sumsub.sns.prooface.a.a("Prooface", "handleState: " + state, null, 4, null);
        if (a(requireContext()) || !this.allowSettingsDialog || getViewModel().r()) {
            return;
        }
        a(state.b());
    }

    public final RectF a(RectF faceBox) {
        int[] iArr = new int[2];
        PreviewView n10 = n();
        if (n10 != null) {
            n10.getLocationInWindow(iArr);
        }
        int[] iArr2 = new int[2];
        SNSLivenessFaceView q10 = q();
        if (q10 != null) {
            q10.getLocationInWindow(iArr2);
        }
        return new RectF(((faceBox.left * n().getWidth()) - iArr2[0]) + iArr[0], ((faceBox.top * n().getHeight()) - iArr2[1]) + iArr[1], ((faceBox.right * n().getWidth()) - iArr2[0]) + iArr[0], ((faceBox.bottom * n().getHeight()) - iArr2[1]) + iArr[1]);
    }

    public final void a(b.g.f result) {
        com.sumsub.sns.prooface.data.j f10 = result.f();
        Pair<Drawable, SNSStepState> a10 = a(f10);
        Drawable drawable = a10.f23089a;
        SNSStepState sNSStepState = a10.f23090b;
        ImageView s10 = s();
        if (s10 != null) {
            SNSStepViewExtensionsKt.setSnsStepState(s10, sNSStepState);
        }
        ImageView s11 = s();
        if (s11 != null) {
            s11.setImageDrawable(drawable);
        }
        TextView w2 = w();
        if (w2 != null) {
            w2.setText(result.h());
        }
        TextView v10 = v();
        if (v10 != null) {
            v10.setText(result.g());
        }
        if (!kotlin.jvm.internal.f.b(f10 != null ? f10.getAnswer() : null, AnswerType.Green.getValue()) && (f10 == null || !kotlin.jvm.internal.f.b(f10.getAllowContinuing(), Boolean.TRUE))) {
            Button m2 = m();
            if (m2 != null) {
                m2.setVisibility(0);
            }
            Button m9 = m();
            if (m9 != null) {
                m9.setText(result.e());
            }
            Button m10 = m();
            if (m10 != null) {
                m10.setOnClickListener(new J7.b(this, 20));
            }
        } else {
            Button m11 = m();
            if (m11 != null) {
                m11.setVisibility(8);
            }
            BuildersKt__Builders_commonKt.launch$default(C0552s.a(getViewLifecycleOwner()), null, null, new f(f10, null), 3, null);
        }
        D();
    }

    public static final void a(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(sNSLiveness3dFaceFragment.getAnalyticsDelegate(), Screen.LivenessScreen, sNSLiveness3dFaceFragment.getIdDocSetType(), Control.RetryButton, null, 8, null);
        sNSLiveness3dFaceFragment.z();
        sNSLiveness3dFaceFragment.E();
        sNSLiveness3dFaceFragment.C();
    }

    public final Pair<Drawable, SNSStepState> a(com.sumsub.sns.prooface.data.j session) {
        String answer = session != null ? session.getAnswer() : null;
        AnswerType answerType = AnswerType.Green;
        if (kotlin.jvm.internal.f.b(answer, answerType.getValue())) {
            return new Pair<>(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.SUCCESS.getImageName()), SNSStepState.APPROVED);
        }
        if (session != null && kotlin.jvm.internal.f.b(session.getAllowContinuing(), Boolean.TRUE) && !kotlin.jvm.internal.f.b(session.getAnswer(), answerType.getValue())) {
            return new Pair<>(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.SUBMITTED.getImageName()), SNSStepState.PENDING);
        }
        return new Pair<>(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSResultIcons.FAILURE.getImageName()), SNSStepState.REJECTED);
    }

    public final void a(a.n event) {
        androidx.appcompat.app.b a10;
        a10 = com.sumsub.sns.internal.core.android.c.f15027a.a(requireActivity(), event.f(), event.h(), event.g(), (r16 & 16) != 0 ? null : new e(), (r16 & 32) != 0 ? null : null);
        a10.show();
        this.lackOfPermissionDialog = a10;
    }

    public final void a(b.j dialog) {
        if (dialog == null || this.writeSettingDialogShown) {
            return;
        }
        this.writeSettingDialogShown = true;
        final int i9 = 0;
        final int i10 = 1;
        final int i11 = 2;
        androidx.appcompat.app.b create = new SNSAlertDialogBuilder(requireContext()).setMessage(dialog.h()).setPositiveButton(dialog.g(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.prooface.presentation.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSLiveness3dFaceFragment f20335b;

            {
                this.f20335b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                switch (i9) {
                    case 0:
                        SNSLiveness3dFaceFragment.a(this.f20335b, dialogInterface, i12);
                        break;
                    case 1:
                        SNSLiveness3dFaceFragment.b(this.f20335b, dialogInterface, i12);
                        break;
                    default:
                        SNSLiveness3dFaceFragment.c(this.f20335b, dialogInterface, i12);
                        break;
                }
            }
        }).setNegativeButton(dialog.e(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.prooface.presentation.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSLiveness3dFaceFragment f20335b;

            {
                this.f20335b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                switch (i10) {
                    case 0:
                        SNSLiveness3dFaceFragment.a(this.f20335b, dialogInterface, i12);
                        break;
                    case 1:
                        SNSLiveness3dFaceFragment.b(this.f20335b, dialogInterface, i12);
                        break;
                    default:
                        SNSLiveness3dFaceFragment.c(this.f20335b, dialogInterface, i12);
                        break;
                }
            }
        }).setNeutralButton(dialog.f(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.prooface.presentation.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSLiveness3dFaceFragment f20335b;

            {
                this.f20335b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                switch (i11) {
                    case 0:
                        SNSLiveness3dFaceFragment.a(this.f20335b, dialogInterface, i12);
                        break;
                    case 1:
                        SNSLiveness3dFaceFragment.b(this.f20335b, dialogInterface, i12);
                        break;
                    default:
                        SNSLiveness3dFaceFragment.c(this.f20335b, dialogInterface, i12);
                        break;
                }
            }
        }).create();
        this.writeSettingDialog = create;
        if (create != null) {
            create.show();
        }
    }

    public static final void a(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment, DialogInterface dialogInterface, int i9) {
        dialogInterface.dismiss();
        sNSLiveness3dFaceFragment.writeSettingDialog = null;
        sNSLiveness3dFaceFragment.startActivity(new Intent("android.settings.action.MANAGE_WRITE_SETTINGS").addFlags(268435456));
    }

    public final Pair<Integer, Integer> a(Context context, int screenBrightnessMode, int screenBrightnessValue) {
        int i9 = Settings.System.getInt(context.getContentResolver(), "screen_brightness_mode", -1);
        int i10 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        if (i9 != -1 && i10 != -1) {
            Settings.System.putInt(context.getContentResolver(), "screen_brightness_mode", screenBrightnessMode);
            Settings.System.putInt(context.getContentResolver(), "screen_brightness", screenBrightnessValue);
            WindowManager.LayoutParams attributes = requireActivity().getWindow().getAttributes();
            attributes.screenBrightness = screenBrightnessValue / 255.0f;
            requireActivity().getWindow().setAttributes(attributes);
        }
        return new Pair<>(Integer.valueOf(i9), Integer.valueOf(i10));
    }

    public final boolean a(Context context) {
        return Settings.System.canWrite(context);
    }
}
