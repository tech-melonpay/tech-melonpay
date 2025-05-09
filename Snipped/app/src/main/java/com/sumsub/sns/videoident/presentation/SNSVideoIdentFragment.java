package com.sumsub.sns.videoident.presentation;

import O9.f;
import O9.p;
import P9.m;
import P9.s;
import R0.a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.p;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.luminary.mobile.R;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$string;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.core.widget.SNSVideoIdentDocumentView;
import com.sumsub.sns.core.widget.SNSWarningView;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.PermissionPayload;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.c1;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.common.j;
import com.sumsub.sns.internal.core.common.k0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.s0;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.SNSMessage;
import com.sumsub.sns.internal.core.presentation.screen.verification.ValidationIdentifierType;
import com.sumsub.sns.internal.videoident.presentation.AnalyticsCallState;
import com.sumsub.sns.internal.videoident.presentation.ButtonAction;
import com.sumsub.sns.internal.videoident.presentation.PhoneVerificationStatus;
import com.sumsub.sns.internal.videoident.presentation.SNSStepViewItem;
import com.sumsub.sns.internal.videoident.presentation.SNSViewState;
import com.sumsub.sns.internal.videoident.presentation.g;
import com.sumsub.sns.internal.videoident.presentation.h;
import com.sumsub.sns.internal.videoident.presentation.k;
import com.sumsub.sns.internal.videoident.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatController;
import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatState;
import com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment;
import com.sumsub.sns.videoident.service.SNSVideoChatService;
import com.twilio.video.VideoTextureView;
import com.twilio.video.VideoView;
import e.AbstractC0704c;
import j3.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k0.C0913a;
import k1.C0923d;
import k1.C0930k;
import k1.H;
import k1.J;
import ka.C0969n;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import sa.AbstractC1244a;
import tvi.webrtc.VideoSink;

@Metadata(d1 = {"\u0000Ò\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r*\u0004\u008c\u0001¬\u0001\u0018\u0000 \u0084\u00022\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0084\u0002\u0085\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010\u0005J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J!\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J#\u00104\u001a\u00020\b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001a02H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\b2\u0006\u0010!\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\b2\u0006\u0010!\u001a\u000206H\u0002¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\u0005J\u0017\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b?\u0010>J\u001d\u0010B\u001a\u00020\b2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0@H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\b2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\b2\u0006\u0010!\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u0010\nJ\u000f\u0010M\u001a\u00020\u001aH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u001aH\u0002¢\u0006\u0004\bO\u0010NJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020,H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u001a2\u0006\u0010S\u001a\u00020\u0002H\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\b2\u0006\u0010!\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\b2\u0006\u0010!\u001a\u00020VH\u0002¢\u0006\u0004\bY\u0010XJ\u0017\u0010Z\u001a\u00020\b2\u0006\u0010!\u001a\u00020VH\u0002¢\u0006\u0004\bZ\u0010XJ\u001f\u0010]\u001a\u00020\b2\u0006\u0010\\\u001a\u00020[2\u0006\u0010!\u001a\u00020VH\u0002¢\u0006\u0004\b]\u0010^J/\u0010c\u001a\u00020\b2\u0006\u0010!\u001a\u00020V2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020\u001a2\u0006\u0010b\u001a\u00020\u001aH\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010h\u001a\u00020\b2\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\bH\u0002¢\u0006\u0004\bj\u0010\u0005J%\u0010p\u001a\u00020\b2\u0006\u0010l\u001a\u00020k2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020n0mH\u0002¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\bH\u0002¢\u0006\u0004\br\u0010\u0005R\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010y\u001a\u00020x8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010zR$\u0010}\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0|\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0080\u0001\u001a\u00060\u007fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\"\u0010\u0086\u0001\u001a\u000b\u0012\u0004\u0012\u00020k\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\"\u0010\u0088\u0001\u001a\u000b\u0012\u0004\u0012\u00020k\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0087\u0001R\"\u0010\u0089\u0001\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u0012\u0005\b\u008b\u0001\u0010\u0005R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0095\u0001\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001f\u0010\u009b\u0001\u001a\u00020,8\u0014X\u0094D¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u009c\u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¤\u0001R\u001a\u0010§\u0001\u001a\u00030¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010©\u0001\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b©\u0001\u0010uR!\u0010ª\u0001\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\"\u0010´\u0001\u001a\r ³\u0001*\u0005\u0018\u00010²\u00010²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R$\u0010¹\u0001\u001a\u000f\u0012\u0004\u0012\u00020,\u0012\u0005\u0012\u00030¶\u0001028VX\u0096\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R$\u0010»\u0001\u001a\u000f\u0012\u0004\u0012\u00020,\u0012\u0005\u0012\u00030¶\u0001028VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010¸\u0001R$\u0010½\u0001\u001a\u000f\u0012\u0004\u0012\u00020,\u0012\u0005\u0012\u00030¶\u0001028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010¸\u0001R$\u0010¿\u0001\u001a\u000f\u0012\u0004\u0012\u00020,\u0012\u0005\u0012\u00030¶\u0001028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¸\u0001R\u001a\u0010Ã\u0001\u001a\u0005\u0018\u00010À\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0019\u0010Æ\u0001\u001a\u0004\u0018\u00010k8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u001a\u0010Ê\u0001\u001a\u0005\u0018\u00010Ç\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0019\u0010Í\u0001\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u001a\u0010Ï\u0001\u001a\u0005\u0018\u00010À\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Â\u0001R\u001a\u0010Ñ\u0001\u001a\u0005\u0018\u00010À\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Â\u0001R\u001a\u0010Ó\u0001\u001a\u0005\u0018\u00010À\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Â\u0001R\u0019\u0010Õ\u0001\u001a\u0004\u0018\u00010k8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Å\u0001R\u0019\u0010×\u0001\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010Ì\u0001R\u001a\u0010Ù\u0001\u001a\u0005\u0018\u00010Ç\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010É\u0001R\u001a\u0010Û\u0001\u001a\u0005\u0018\u00010À\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Â\u0001R\u001a\u0010Ý\u0001\u001a\u0005\u0018\u00010À\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Â\u0001R\u0019\u0010à\u0001\u001a\u0004\u0018\u00010[8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0019\u0010â\u0001\u001a\u0004\u0018\u00010[8BX\u0082\u0004¢\u0006\b\u001a\u0006\bá\u0001\u0010ß\u0001R\u0019\u0010ä\u0001\u001a\u0004\u0018\u00010[8BX\u0082\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ß\u0001R\u0019\u0010æ\u0001\u001a\u0004\u0018\u00010k8BX\u0082\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010Å\u0001R\u001a\u0010ê\u0001\u001a\u0005\u0018\u00010ç\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u001a\u0010î\u0001\u001a\u0005\u0018\u00010ë\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010í\u0001R\u0019\u0010ð\u0001\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010Ì\u0001R\u0019\u0010ò\u0001\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010Ì\u0001R\u0019\u0010õ\u0001\u001a\u0004\u0018\u00010_8BX\u0082\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010ô\u0001R\u001a\u0010÷\u0001\u001a\u0005\u0018\u00010À\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010Â\u0001R\u0018\u0010l\u001a\u0004\u0018\u00010k8BX\u0082\u0004¢\u0006\b\u001a\u0006\bø\u0001\u0010Å\u0001R\u001d\u0010o\u001a\t\u0012\u0005\u0012\u00030ù\u00010m8BX\u0082\u0004¢\u0006\b\u001a\u0006\bú\u0001\u0010û\u0001R\u0019\u0010ý\u0001\u001a\u0004\u0018\u00010k8BX\u0082\u0004¢\u0006\b\u001a\u0006\bü\u0001\u0010Å\u0001R$\u0010ÿ\u0001\u001a\u000f\u0012\u0004\u0012\u00020,\u0012\u0005\u0012\u00030¶\u0001028BX\u0082\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010¸\u0001R$\u0010\u0081\u0002\u001a\u000f\u0012\u0004\u0012\u00020,\u0012\u0005\u0012\u00030¶\u0001028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010¸\u0001R$\u0010\u0083\u0002\u001a\u000f\u0012\u0004\u0012\u00020,\u0012\u0005\u0012\u00030¶\u0001028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010¸\u0001¨\u0006\u0086\u0002"}, d2 = {"Lcom/sumsub/sns/videoident/presentation/SNSVideoIdentFragment;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState;", "Lcom/sumsub/sns/internal/videoident/presentation/h;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "onDestroyView", "outState", "onSaveInstanceState", "onCloseButtonClick", "", "getLayoutId", "()I", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "state", "handleState", "(Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState;Landroid/os/Bundle;)V", "showPhoneVerificationFragment", "code", "onPhoneVerificationResult", "(I)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "calculateExpandedOffset", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)I", "", "docSetType", "Landroid/net/Uri;", "uri", "handleFileSelectedForDocSetType", "(Ljava/lang/String;Landroid/net/Uri;)V", "", "grantResults", "handlePermissionResults", "(Ljava/util/Map;)V", "Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$d;", "showRecordAudioPermissionDialog", "(Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$d;)V", "showCameraPermissionDialog", "switchCameraAndUpdateMirroring", "Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatController;", "videoChatController", "attachChatControllerListeners", "(Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatController;)V", "detachChatControllerListeners", "Lkotlin/Function0;", "finishCallback", "showPhotoMadeAnimation", "(Lca/a;)V", "accessToken", "roomName", "doStartServiceAndConnectToRoom", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$b;", "handleSelectLanguage", "(Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$b;)V", "result", "handleLanguageSelectionResult", "hideLanguageSelection", "()Z", "hidePhoneVerification", "permission", "requestPermission", "(Ljava/lang/String;)V", "newState", "releaseCurrentStatePreviewIfChanged", "(Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState;)Z", "Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$e;", "updateLanguageSection", "(Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$e;)V", "showExitConfirmationState", "startBottomAnimation", "Landroid/widget/Button;", "button", "updateBottomPrimaryButton", "(Landroid/widget/Button;Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$e;)V", "Lcom/twilio/video/VideoTextureView;", "remoteVideo", "showRemoteVideo", "wasHidden", "updateRemoteVideoView", "(Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState$e;Lcom/twilio/video/VideoTextureView;ZZ)V", "videoView", "", "scale", "applyVideoViewSize", "(Landroid/view/View;F)V", "updateRecordTimerText", "Landroid/view/ViewGroup;", "documentList", "", "Lcom/sumsub/sns/internal/videoident/presentation/SNSStepViewItem;", "documents", "populateDocumentList", "(Landroid/view/ViewGroup;Ljava/util/List;)V", "requestAllPermissions", "Landroidx/appcompat/app/b;", "lackOfPermissionDialog", "Landroidx/appcompat/app/b;", "checkPermissionsOnStart", "Z", "Lcom/sumsub/sns/internal/core/android/a;", "pickerLifecycleObserver", "Lcom/sumsub/sns/internal/core/android/a;", "Le/c;", "", "permissionLauncher", "Le/c;", "Lcom/sumsub/sns/videoident/presentation/SNSVideoIdentFragment$SNSVideoChatAdapterImpl;", "videoChatAdapter", "Lcom/sumsub/sns/videoident/presentation/SNSVideoIdentFragment$SNSVideoChatAdapterImpl;", "Lkotlinx/coroutines/CoroutineScope;", "fragmentScope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "phoneVerificationBottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "remoteVideoScale", "Ljava/lang/Float;", "getRemoteVideoScale$annotations", "com/sumsub/sns/videoident/presentation/SNSVideoIdentFragment$uriContentLoader$1", "uriContentLoader", "Lcom/sumsub/sns/videoident/presentation/SNSVideoIdentFragment$uriContentLoader$1;", "currentViewState", "Lcom/sumsub/sns/internal/videoident/presentation/SNSViewState;", "viewModel$delegate", "LO9/f;", "getViewModel", "()Lcom/sumsub/sns/internal/videoident/presentation/h;", "viewModel", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "idDocSetType", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "previousVolumeControlStream", "I", "currentCameraId", "Lkotlinx/coroutines/Job;", "chatMessagesCollectJob", "Lkotlinx/coroutines/Job;", "chatStateCollectJob", "Lcom/sumsub/sns/internal/videoident/presentation/AnalyticsCallState;", "callState", "Lcom/sumsub/sns/internal/videoident/presentation/AnalyticsCallState;", "exitConfirmationDialog", "startServiceAndConnectToRoom", "Lca/a;", "com/sumsub/sns/videoident/presentation/SNSVideoIdentFragment$serviceConnection$1", "serviceConnection", "Lcom/sumsub/sns/videoident/presentation/SNSVideoIdentFragment$serviceConnection$1;", "Ljava/text/SimpleDateFormat;", "shortTimeFormat", "Ljava/text/SimpleDateFormat;", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "calendar", "Ljava/util/Calendar;", "", "getOpenPayload", "()Ljava/util/Map;", "openPayload", "getCancelPayload", "cancelPayload", "getClosePayload", "closePayload", "getAppearPayload", "appearPayload", "Landroid/widget/TextView;", "getRecordTime", "()Landroid/widget/TextView;", "recordTime", "getBottomSheet", "()Landroid/view/ViewGroup;", "bottomSheet", "Lcom/sumsub/sns/core/widget/SNSWarningView;", "getMessage", "()Lcom/sumsub/sns/core/widget/SNSWarningView;", "message", "getSwitchCamera", "()Landroid/view/View;", "switchCamera", "getLanguageSectionTitle", "languageSectionTitle", "getLanguage", "language", "getChangeLanguage", "changeLanguage", "getLanguageSection", "languageSection", "getBottomProgressBar", "bottomProgressBar", "getBottomWarning", "bottomWarning", "getBottomText", "bottomText", "getBottomTitle", "bottomTitle", "getBottomPrimaryButton", "()Landroid/widget/Button;", "bottomPrimaryButton", "getBottomSecondaryButton", "bottomSecondaryButton", "getBottomTertiaryButton", "bottomTertiaryButton", "getPhotoPreviewContainer", "photoPreviewContainer", "Landroid/widget/ImageView;", "getPhotoPreview", "()Landroid/widget/ImageView;", "photoPreview", "Lcom/twilio/video/VideoView;", "getLocalVideoView", "()Lcom/twilio/video/VideoView;", "localVideoView", "getPhotoMadeIndicator", "photoMadeIndicator", "getRemoteVideoContainer", "remoteVideoContainer", "getRemoteVideoView", "()Lcom/twilio/video/VideoTextureView;", "remoteVideoView", "getOperatorName", "operatorName", "getDocumentList", "Lcom/sumsub/sns/internal/core/data/model/Document;", "getDocuments", "()Ljava/util/List;", "getPhoneVerificationBottomSheet", "phoneVerificationBottomSheet", "getCompletePayload", "completePayload", "getCommonPayload", "commonPayload", "getPermissionsPayload", "permissionsPayload", "Companion", "SNSVideoChatAdapterImpl", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSVideoIdentFragment extends com.sumsub.sns.core.presentation.b<SNSViewState, h> {
    private static final String ARG_DOCS = "docs";
    private static final String CALL_STATE = "call_state";
    private static final String CAMERA_ID = "camera_id";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String LANGUAGE_REQUEST_KEY = "language_request_key";
    private static final String OBSERVER_ITEM_ID = "observer_item_id";
    public static final String TAG = "SNSVideoIdentFragment";
    private static final String VERIFICATION_REQUEST_KEY = "verification_request_key";
    private BottomSheetBehavior<ViewGroup> bottomSheetBehavior;
    private final Calendar calendar;
    private AnalyticsCallState callState;
    private Job chatMessagesCollectJob;
    private Job chatStateCollectJob;
    private boolean checkPermissionsOnStart;
    private String currentCameraId;
    private SNSViewState currentViewState;
    private androidx.appcompat.app.b exitConfirmationDialog;
    private final String idDocSetType;
    private androidx.appcompat.app.b lackOfPermissionDialog;
    private AbstractC0704c<String[]> permissionLauncher;
    private BottomSheetBehavior<ViewGroup> phoneVerificationBottomSheetBehavior;
    private com.sumsub.sns.internal.core.android.a pickerLifecycleObserver;
    private int previousVolumeControlStream;
    private final Screen screen;
    private final SNSVideoIdentFragment$serviceConnection$1 serviceConnection;
    private final SimpleDateFormat shortTimeFormat;
    private InterfaceC0635a<p> startServiceAndConnectToRoom;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final f viewModel;
    private final SNSVideoChatAdapterImpl videoChatAdapter = new SNSVideoChatAdapterImpl();
    private final CoroutineScope fragmentScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    private Float remoteVideoScale = Float.valueOf(1.66f);
    private final SNSVideoIdentFragment$uriContentLoader$1 uriContentLoader = new c1() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$uriContentLoader$1
        @Override // com.sumsub.sns.internal.core.common.c1
        public Object copyContentsToCacheFile(Uri uri, T9.a<? super String> aVar) {
            return i.b(uri, SNSVideoIdentFragment.this.getContext(), aVar);
        }
    };

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/sumsub/sns/videoident/presentation/SNSVideoIdentFragment$Companion;", "", "()V", "ARG_DOCS", "", "CALL_STATE", "CAMERA_ID", "LANGUAGE_REQUEST_KEY", "OBSERVER_ITEM_ID", "TAG", "VERIFICATION_REQUEST_KEY", "create", "Landroidx/fragment/app/Fragment;", "documents", "", "Lcom/sumsub/sns/internal/core/data/model/Document;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fragment create(List<Document> documents) {
            SNSVideoIdentFragment sNSVideoIdentFragment = new SNSVideoIdentFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(SNSVideoIdentFragment.ARG_DOCS, new ArrayList<>(documents));
            sNSVideoIdentFragment.setArguments(bundle);
            return sNSVideoIdentFragment;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sumsub/sns/videoident/presentation/SNSVideoIdentFragment$SNSVideoChatAdapterImpl;", "Lcom/sumsub/sns/internal/videoident/presentation/g;", "<init>", "(Lcom/sumsub/sns/videoident/presentation/SNSVideoIdentFragment;)V", "Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;", "", "asJson", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;)Ljava/lang/String;", "accessToken", "roomName", "LO9/p;", "connectToRoom", "(Ljava/lang/String;Ljava/lang/String;)V", "disconnect", "()V", "makePhoto", "message", "sendMessage", "(Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ClientMessage;)V", "Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState;", "getState", "()Lcom/sumsub/sns/internal/videoident/videoident/chat/SNSVideoChatState;", "state", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public final class SNSVideoChatAdapterImpl implements g {

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SNSMessage.ClientMessage.Type.values().length];
                iArr[SNSMessage.ClientMessage.Type.USER_VISIBILITY_STATE.ordinal()] = 1;
                iArr[SNSMessage.ClientMessage.Type.SCREENSHOT_MADE.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public SNSVideoChatAdapterImpl() {
        }

        private final String asJson(SNSMessage.ClientMessage clientMessage) {
            int i = WhenMappings.$EnumSwitchMapping$0[clientMessage.getType().ordinal()];
            if (i == 1) {
                AbstractC1244a t3 = SNSVideoIdentFragment.this.getServiceLocator().t();
                return t3.b(e.B(t3.f27066b, kotlin.jvm.internal.h.d(SNSMessage.ClientMessage.UserVisibilityState.class)), (SNSMessage.ClientMessage.UserVisibilityState) clientMessage);
            }
            if (i != 2) {
                AbstractC1244a t10 = SNSVideoIdentFragment.this.getServiceLocator().t();
                return t10.b(e.B(t10.f27066b, kotlin.jvm.internal.h.d(SNSMessage.ClientMessage.class)), clientMessage);
            }
            AbstractC1244a t11 = SNSVideoIdentFragment.this.getServiceLocator().t();
            return t11.b(e.B(t11.f27066b, kotlin.jvm.internal.h.d(SNSMessage.ClientMessage.e.class)), (SNSMessage.ClientMessage.e) clientMessage);
        }

        @Override // com.sumsub.sns.internal.videoident.presentation.g
        public void connectToRoom(final String accessToken, final String roomName) {
            final SNSVideoIdentFragment sNSVideoIdentFragment = SNSVideoIdentFragment.this;
            InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a<p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$SNSVideoChatAdapterImpl$connectToRoom$performAfterServiceConnection$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // ca.InterfaceC0635a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f3034a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SNSVideoIdentFragment.this.startServiceAndConnectToRoom = null;
                    SNSVideoIdentFragment.this.doStartServiceAndConnectToRoom(accessToken, roomName);
                }
            };
            if (SNSVideoIdentFragment.this.serviceConnection.getConnected()) {
                interfaceC0635a.invoke();
            } else {
                SNSVideoIdentFragment.this.startServiceAndConnectToRoom = interfaceC0635a;
            }
        }

        @Override // com.sumsub.sns.internal.videoident.presentation.g
        public void disconnect() {
            SNSVideoChatController videoChatController;
            SNSVideoChatService service = SNSVideoIdentFragment.this.serviceConnection.getService();
            if (service == null || (videoChatController = service.getVideoChatController()) == null) {
                return;
            }
            videoChatController.a();
        }

        @Override // com.sumsub.sns.internal.videoident.presentation.g
        public SNSVideoChatState getState() {
            SNSVideoChatController videoChatController;
            StateFlow<SNSVideoChatState> l10;
            SNSVideoChatService service = SNSVideoIdentFragment.this.serviceConnection.getService();
            if (service == null || (videoChatController = service.getVideoChatController()) == null || (l10 = videoChatController.l()) == null) {
                return null;
            }
            return l10.getValue();
        }

        @Override // com.sumsub.sns.internal.videoident.presentation.g
        public void makePhoto() {
            SNSVideoChatController videoChatController;
            SNSVideoChatService service = SNSVideoIdentFragment.this.serviceConnection.getService();
            if (service == null || (videoChatController = service.getVideoChatController()) == null) {
                return;
            }
            videoChatController.o();
        }

        @Override // com.sumsub.sns.internal.videoident.presentation.g
        public void sendMessage(SNSMessage.ClientMessage message) {
            SNSVideoChatController videoChatController;
            if (SNSVideoIdentFragment.this.getServiceLocatorSafe() == null) {
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "sendMessage failed. Detached from activity", null, 4, null);
                return;
            }
            String asJson = asJson(message);
            SNSVideoChatService service = SNSVideoIdentFragment.this.serviceConnection.getService();
            if (service == null || (videoChatController = service.getVideoChatController()) == null) {
                return;
            }
            videoChatController.a(asJson);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$uriContentLoader$1] */
    public SNSVideoIdentFragment() {
        InterfaceC0635a<T> interfaceC0635a = new InterfaceC0635a<T>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final T invoke() {
                List documents;
                SNSVideoIdentFragment.SNSVideoChatAdapterImpl sNSVideoChatAdapterImpl;
                SNSVideoIdentFragment$uriContentLoader$1 sNSVideoIdentFragment$uriContentLoader$1;
                documents = SNSVideoIdentFragment.this.getDocuments();
                SNSVideoIdentFragment sNSVideoIdentFragment = SNSVideoIdentFragment.this;
                com.sumsub.sns.internal.core.a serviceLocator = sNSVideoIdentFragment.getServiceLocator();
                Bundle arguments = SNSVideoIdentFragment.this.getArguments();
                sNSVideoChatAdapterImpl = SNSVideoIdentFragment.this.videoChatAdapter;
                sNSVideoIdentFragment$uriContentLoader$1 = SNSVideoIdentFragment.this.uriContentLoader;
                return new com.sumsub.sns.internal.videoident.presentation.i(documents, sNSVideoIdentFragment, serviceLocator, arguments, sNSVideoChatAdapterImpl, sNSVideoIdentFragment$uriContentLoader$1);
            }
        };
        final InterfaceC0635a<Fragment> interfaceC0635a2 = new InterfaceC0635a<Fragment>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        final f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new InterfaceC0635a<X>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final X invoke() {
                return (X) InterfaceC0635a.this.invoke();
            }
        });
        final InterfaceC0635a interfaceC0635a3 = null;
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(h.class), new InterfaceC0635a<W>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) f.this.getValue()).getViewModelStore();
            }
        }, interfaceC0635a, new InterfaceC0635a<R0.a>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final R0.a invoke() {
                R0.a aVar;
                InterfaceC0635a interfaceC0635a4 = InterfaceC0635a.this;
                if (interfaceC0635a4 != null && (aVar = (R0.a) interfaceC0635a4.invoke()) != null) {
                    return aVar;
                }
                X x9 = (X) b9.getValue();
                InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
                return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
            }
        });
        this.screen = Screen.VideoidentScreen;
        this.idDocSetType = DocumentType.f15254k;
        this.previousVolumeControlStream = Integer.MIN_VALUE;
        this.callState = AnalyticsCallState.PREPARING;
        this.serviceConnection = new SNSVideoIdentFragment$serviceConnection$1(this);
        this.shortTimeFormat = new SimpleDateFormat("mm:ss", Locale.US);
        this.calendar = Calendar.getInstance();
    }

    private final void applyVideoViewSize(View videoView, float scale) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "applying video scale " + scale, null, 4, null);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        ViewGroup.LayoutParams layoutParams = videoView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i = (getResources().getDisplayMetrics().widthPixels / 2) - (dimensionPixelSize * 2);
        layoutParams.width = i;
        layoutParams.height = U4.b.C(i / scale);
        videoView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachChatControllerListeners(SNSVideoChatController videoChatController) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.fragmentScope, null, null, new SNSVideoIdentFragment$attachChatControllerListeners$1(videoChatController, this, null), 3, null);
        this.chatMessagesCollectJob = launch$default;
        this.chatStateCollectJob = b0.b(videoChatController.l(), this, new SNSVideoIdentFragment$attachChatControllerListeners$2(this, null));
        videoChatController.a(new InterfaceC0635a<p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$3
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                final SNSVideoIdentFragment sNSVideoIdentFragment = SNSVideoIdentFragment.this;
                sNSVideoIdentFragment.showPhotoMadeAnimation(new InterfaceC0635a<p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$3.1
                    {
                        super(0);
                    }

                    @Override // ca.InterfaceC0635a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f3034a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        SNSVideoIdentFragment.this.getViewModel().T();
                    }
                });
            }
        });
        videoChatController.b(new InterfaceC0635a<p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$4
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SNSVideoIdentFragment.this.getViewModel().W();
            }
        });
        videoChatController.a(new InterfaceC0646l<Bitmap, p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$5
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ p invoke(Bitmap bitmap) {
                invoke2(bitmap);
                return p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Bitmap bitmap) {
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onPhotoMade: w=" + bitmap.getWidth() + ", h=" + bitmap.getHeight(), null, 4, null);
                SNSVideoIdentFragment.this.getViewModel().a(bitmap);
            }
        });
        videoChatController.b(new InterfaceC0646l<Long, p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$attachChatControllerListeners$6
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ p invoke(Long l10) {
                invoke(l10.longValue());
                return p.f3034a;
            }

            public final void invoke(long j10) {
                SNSVideoIdentFragment.this.updateRecordTimerText();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateExpandedOffset(CoordinatorLayout parent) {
        int i = 0;
        int measuredHeight = requireActivity().findViewById(R$id.above_bottom_sheet_container).getMeasuredHeight() + (getContext() instanceof Activity ? com.sumsub.sns.internal.core.common.a.b(requireActivity(), R.attr.actionBarSize) : 0);
        SNSWarningView message = getMessage();
        if (message != null && message.getVisibility() == 0) {
            measuredHeight += message.getHeight();
        }
        View remoteVideoContainer = getRemoteVideoContainer();
        if (remoteVideoContainer != null && remoteVideoContainer.getVisibility() == 0 && this.remoteVideoScale != null) {
            measuredHeight += remoteVideoContainer.getHeight();
        }
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            bottomSheet.measure(View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(parent.getHeight() - measuredHeight, Integer.MIN_VALUE));
            i = parent.getHeight() - bottomSheet.getMeasuredHeight();
        }
        return Math.max(i, measuredHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachChatControllerListeners(SNSVideoChatController videoChatController) {
        Job job = this.chatMessagesCollectJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            this.chatMessagesCollectJob = null;
        }
        videoChatController.b((InterfaceC0635a<p>) null);
        videoChatController.a((InterfaceC0646l<? super Bitmap, p>) null);
        videoChatController.b((InterfaceC0646l<? super Long, p>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doStartServiceAndConnectToRoom(String accessToken, String roomName) {
        SNSVideoChatController videoChatController;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "doStartServiceAndConnectToRoom: token=" + accessToken.substring(0, 5) + ", room=" + roomName, null, 4, null);
        SNSVideoChatService service = this.serviceConnection.getService();
        if (service == null || !service.getIsInForeground()) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "starting foreground", null, 4, null);
            Context requireContext = requireContext();
            Intent intent = new Intent(requireContext(), (Class<?>) SNSVideoChatService.class);
            intent.setAction(SNSVideoChatService.ACTION_START_FOREGROUND);
            intent.putExtra(SNSVideoChatService.SNS_EXTRA_SESSION, getSession());
            C0913a.startForegroundService(requireContext, intent);
        }
        SNSVideoChatService service2 = this.serviceConnection.getService();
        if (service2 == null || (videoChatController = service2.getVideoChatController()) == null) {
            return;
        }
        videoChatController.a(requireContext(), accessToken, roomName);
    }

    private final Button getBottomPrimaryButton() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (Button) bottomSheet.findViewById(R$id.sns_button1);
        }
        return null;
    }

    private final View getBottomProgressBar() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return bottomSheet.findViewById(R$id.sns_vi_bottom_progress_bar);
        }
        return null;
    }

    private final Button getBottomSecondaryButton() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (Button) bottomSheet.findViewById(R$id.sns_button2);
        }
        return null;
    }

    private final ViewGroup getBottomSheet() {
        View view = getView();
        if (view != null) {
            return (ViewGroup) view.findViewById(R$id.sns_web_view_bottom_sheet);
        }
        return null;
    }

    private final Button getBottomTertiaryButton() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (Button) bottomSheet.findViewById(R$id.sns_button3);
        }
        return null;
    }

    private final TextView getBottomText() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (TextView) bottomSheet.findViewById(R$id.sns_text);
        }
        return null;
    }

    private final TextView getBottomTitle() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (TextView) bottomSheet.findViewById(R$id.sns_title);
        }
        return null;
    }

    private final SNSWarningView getBottomWarning() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (SNSWarningView) bottomSheet.findViewById(R$id.sns_warning);
        }
        return null;
    }

    private final TextView getChangeLanguage() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (TextView) bottomSheet.findViewById(R$id.sns_button);
        }
        return null;
    }

    private final Map<String, Object> getCommonPayload() {
        return kotlin.collections.a.s(new Pair("callState", this.callState.getValue()), new Pair("shouldConfirmExit", Boolean.valueOf(this.exitConfirmationDialog != null)), new Pair("fromScreen", getScreen().getText()));
    }

    private final Map<String, Object> getCompletePayload() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(getCommonPayload());
        linkedHashMap.putAll(getPermissionsPayload());
        return linkedHashMap;
    }

    private final ViewGroup getDocumentList() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (ViewGroup) bottomSheet.findViewById(R$id.documents);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Document> getDocuments() {
        List<Document> c02;
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList(ARG_DOCS);
        return (parcelableArrayList == null || (c02 = s.c0(parcelableArrayList)) == null) ? EmptyList.f23104a : c02;
    }

    private final TextView getLanguage() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (TextView) bottomSheet.findViewById(R$id.sns_label);
        }
        return null;
    }

    private final ViewGroup getLanguageSection() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (ViewGroup) bottomSheet.findViewById(R$id.language_section);
        }
        return null;
    }

    private final TextView getLanguageSectionTitle() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (TextView) bottomSheet.findViewById(R$id.sns_language_section_title);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VideoView getLocalVideoView() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R$id.local_video_view);
        }
        return null;
    }

    private final SNSWarningView getMessage() {
        View view = getView();
        if (view != null) {
            return (SNSWarningView) view.findViewById(R$id.message);
        }
        return null;
    }

    private final TextView getOperatorName() {
        View remoteVideoContainer = getRemoteVideoContainer();
        if (remoteVideoContainer != null) {
            return (TextView) remoteVideoContainer.findViewById(R$id.title);
        }
        return null;
    }

    private final Map<String, Object> getPermissionsPayload() {
        Context context = getContext();
        if (context == null) {
            return kotlin.collections.a.p();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PermissionPayload.MICROPHONE_PERMISSION.toString(), Boolean.valueOf(j.a(context, "android.permission.RECORD_AUDIO")));
        linkedHashMap.put(PermissionPayload.CAMERA_PERMISSION.toString(), Boolean.valueOf(j.a(context, "android.permission.CAMERA")));
        linkedHashMap.put("hasNotificationsEnabled", Boolean.valueOf(j.b(context, SNSVideoChatService.NOTIFICATION_CHANNEL_ID)));
        return linkedHashMap;
    }

    private final ViewGroup getPhoneVerificationBottomSheet() {
        View view = getView();
        if (view != null) {
            return (ViewGroup) view.findViewById(R$id.phone_verification_bottom_sheet);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getPhotoMadeIndicator() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R$id.photo_made_indicator);
        }
        return null;
    }

    private final ImageView getPhotoPreview() {
        ViewGroup photoPreviewContainer = getPhotoPreviewContainer();
        if (photoPreviewContainer != null) {
            return (ImageView) photoPreviewContainer.findViewById(R$id.sns_photo);
        }
        return null;
    }

    private final ViewGroup getPhotoPreviewContainer() {
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            return (ViewGroup) bottomSheet.findViewById(R$id.sns_photo_preview);
        }
        return null;
    }

    private final TextView getRecordTime() {
        View view = getView();
        if (view != null) {
            return (TextView) view.findViewById(R$id.timer);
        }
        return null;
    }

    private final View getRemoteVideoContainer() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R$id.remote_video);
        }
        return null;
    }

    private final VideoTextureView getRemoteVideoView() {
        View remoteVideoContainer = getRemoteVideoContainer();
        if (remoteVideoContainer != null) {
            return remoteVideoContainer.findViewById(R$id.remote_video_view);
        }
        return null;
    }

    private final View getSwitchCamera() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R$id.switchCamera);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFileSelectedForDocSetType(String docSetType, Uri uri) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleFileSelectedForDocSetType: " + docSetType + ", " + uri, null, 4, null);
        if (uri == null) {
            return;
        }
        getViewModel().a(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLanguageSelectionResult(Bundle result) {
        hideLanguageSelection();
        getViewModel().b(result.getString(LanguageSelectionFragment.RESULT_KEY_SELECTED_LANGUAGE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePermissionResults(Map<String, Boolean> grantResults) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handlePermissionResults: " + grantResults, null, 4, null);
        if (grantResults.containsKey("android.permission.POST_NOTIFICATIONS")) {
            getViewModel().U();
        } else {
            getViewModel().a(grantResults);
        }
    }

    private final void handleSelectLanguage(SNSViewState.b state) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C0527a c0527a = new C0527a(childFragmentManager);
        c0527a.e(R$id.phone_verification_fragment, LanguageSelectionFragment.INSTANCE.getInstance(state).forResult(LANGUAGE_REQUEST_KEY), null);
        c0527a.c("language_fragment");
        c0527a.i(true, true);
        getChildFragmentManager().g0(LANGUAGE_REQUEST_KEY, requireActivity(), new a(this, 1));
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.phoneVerificationBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior2 = this.phoneVerificationBottomSheetBehavior;
        if (bottomSheetBehavior2 == null) {
            return;
        }
        bottomSheetBehavior2.setDraggable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleState$lambda-46$lambda-45, reason: not valid java name */
    public static final void m78handleState$lambda46$lambda45(SNSVideoIdentFragment sNSVideoIdentFragment, View view) {
        sNSVideoIdentFragment.getViewModel().a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleState$lambda-48$lambda-47, reason: not valid java name */
    public static final void m79handleState$lambda48$lambda47(SNSVideoIdentFragment sNSVideoIdentFragment, View view) {
        sNSVideoIdentFragment.getViewModel().Z();
    }

    private final boolean hideLanguageSelection() {
        Fragment F10 = getChildFragmentManager().F(R$id.phone_verification_fragment);
        if (F10 != null) {
            if (!(F10 instanceof LanguageSelectionFragment)) {
                F10 = null;
            }
            if (F10 != null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                childFragmentManager.z(childFragmentManager.new p(null, -1, 0), false);
                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.phoneVerificationBottomSheetBehavior;
                if (bottomSheetBehavior == null) {
                    return true;
                }
                bottomSheetBehavior.setState(5);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hidePhoneVerification() {
        Fragment F10 = getChildFragmentManager().F(R$id.phone_verification_fragment);
        if (F10 != null) {
            if (!(F10 instanceof com.sumsub.sns.core.presentation.screen.verification.a)) {
                F10 = null;
            }
            if (F10 != null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                childFragmentManager.z(childFragmentManager.new p(null, -1, 0), false);
                BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.phoneVerificationBottomSheetBehavior;
                if (bottomSheetBehavior == null) {
                    return true;
                }
                bottomSheetBehavior.setState(5);
                return true;
            }
        }
        return false;
    }

    private final void onPhoneVerificationResult(int code) {
        PhoneVerificationStatus phoneVerificationStatus;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, com.google.android.gms.measurement.internal.a.g(code, "onPhoneVerificationResult: code="), null, 4, null);
        if (code == 1) {
            hidePhoneVerification();
            phoneVerificationStatus = PhoneVerificationStatus.SUCCESS;
        } else if (code != 2) {
            if (code != 3) {
                if (code == 4) {
                    phoneVerificationStatus = PhoneVerificationStatus.RETRY_CODE;
                } else if (code != 5) {
                    Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "SumSubVideoIdent", com.google.android.gms.measurement.internal.a.g(code, "Unknown verification code "), null, 4, null);
                } else {
                    hidePhoneVerification();
                    phoneVerificationStatus = PhoneVerificationStatus.CANCELED;
                }
            }
            phoneVerificationStatus = null;
        } else {
            phoneVerificationStatus = PhoneVerificationStatus.REQUESTED;
        }
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onPhoneVerificationResult: " + phoneVerificationStatus, null, 4, null);
        if (phoneVerificationStatus != null) {
            getViewModel().a(phoneVerificationStatus);
        }
    }

    private final void populateDocumentList(ViewGroup documentList, List<SNSStepViewItem> documents) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "populateDocumentList: count=" + documents.size(), null, 4, null);
        documentList.removeAllViews();
        int i = 0;
        for (Object obj : documents) {
            int i9 = i + 1;
            if (i < 0) {
                m.t();
                throw null;
            }
            SNSStepViewItem sNSStepViewItem = (SNSStepViewItem) obj;
            SNSVideoIdentDocumentView sNSVideoIdentDocumentView = new SNSVideoIdentDocumentView(requireContext(), null, 0, 0, 14, null);
            sNSVideoIdentDocumentView.setSelected(sNSStepViewItem.getState() != SNSStepViewItem.State.DEFAULT);
            sNSVideoIdentDocumentView.setActivated(sNSStepViewItem.getState() == SNSStepViewItem.State.DONE);
            String icon = sNSStepViewItem.getIcon();
            if (icon != null) {
                sNSVideoIdentDocumentView.setIconStart(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), icon));
            }
            CharSequence title = sNSStepViewItem.getTitle();
            sNSVideoIdentDocumentView.setTitle(title != null ? i.a(title, requireContext()) : null);
            documentList.addView(sNSVideoIdentDocumentView);
            i = i9;
        }
    }

    private final boolean releaseCurrentStatePreviewIfChanged(SNSViewState newState) {
        Bitmap M8;
        SNSViewState sNSViewState = this.currentViewState;
        SNSViewState.e eVar = sNSViewState instanceof SNSViewState.e ? (SNSViewState.e) sNSViewState : null;
        if (eVar == null || (M8 = eVar.M()) == null) {
            return false;
        }
        SNSViewState.e eVar2 = newState instanceof SNSViewState.e ? (SNSViewState.e) newState : null;
        if (eVar2 == null || kotlin.jvm.internal.f.b(eVar2.M(), M8)) {
            return false;
        }
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleViewStateChange: releasing previewImage", null, 4, null);
        M8.recycle();
        return true;
    }

    private final void requestAllPermissions() {
        AbstractC0704c<String[]> abstractC0704c = this.permissionLauncher;
        if (abstractC0704c != null) {
            abstractC0704c.a(getViewModel().G());
        }
    }

    private final void requestPermission(String permission) {
        AbstractC0704c<String[]> abstractC0704c;
        if (Build.VERSION.SDK_INT >= 33 && (abstractC0704c = this.permissionLauncher) != null) {
            abstractC0704c.a(new String[]{permission});
        }
    }

    private final void showCameraPermissionDialog(SNSViewState.d state) {
        androidx.appcompat.app.b a10;
        if (this.lackOfPermissionDialog != null) {
            return;
        }
        com.sumsub.sns.internal.core.android.c cVar = com.sumsub.sns.internal.core.android.c.f15027a;
        ActivityC0533g requireActivity = requireActivity();
        com.sumsub.sns.internal.videoident.presentation.f d10 = state.d();
        CharSequence d11 = d10 != null ? d10.d() : null;
        com.sumsub.sns.internal.videoident.presentation.f d12 = state.d();
        CharSequence f10 = d12 != null ? d12.f() : null;
        com.sumsub.sns.internal.videoident.presentation.f d13 = state.d();
        a10 = cVar.a(requireActivity, d11, f10, d13 != null ? d13.e() : null, (r16 & 16) != 0 ? null : new InterfaceC0635a<O9.p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$showCameraPermissionDialog$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public /* bridge */ /* synthetic */ O9.p invoke() {
                invoke2();
                return O9.p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.sumsub.sns.core.presentation.b.finish$default(SNSVideoIdentFragment.this, q.a.f15160b, null, null, 6, null);
            }
        }, (r16 & 32) != 0 ? null : null);
        this.lackOfPermissionDialog = a10;
        if (a10 != null) {
            a10.setOnDismissListener(new b(this, 1));
        }
        androidx.appcompat.app.b bVar = this.lackOfPermissionDialog;
        if (bVar != null) {
            bVar.show();
        }
    }

    private final void showExitConfirmationState(SNSViewState.e state) {
        androidx.appcompat.app.b bVar;
        final Map n10 = com.google.android.gms.measurement.internal.a.n("fromScreen", getScreen().getText());
        SNSViewState.a H10 = state.H();
        if (H10 != null) {
            final int i = 0;
            final int i9 = 1;
            bVar = new SNSAlertDialogBuilder(requireContext()).setMessage(H10.f()).setPositiveButton(H10.e(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.videoident.presentation.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SNSVideoIdentFragment f20343b;

                {
                    this.f20343b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (i) {
                        case 0:
                            SNSVideoIdentFragment.m83showExitConfirmationState$lambda58$lambda54(this.f20343b, n10, dialogInterface, i10);
                            break;
                        default:
                            SNSVideoIdentFragment.m84showExitConfirmationState$lambda58$lambda55(this.f20343b, n10, dialogInterface, i10);
                            break;
                    }
                }
            }).setNegativeButton(H10.d(), new DialogInterface.OnClickListener(this) { // from class: com.sumsub.sns.videoident.presentation.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SNSVideoIdentFragment f20343b;

                {
                    this.f20343b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (i9) {
                        case 0:
                            SNSVideoIdentFragment.m83showExitConfirmationState$lambda58$lambda54(this.f20343b, n10, dialogInterface, i10);
                            break;
                        default:
                            SNSVideoIdentFragment.m84showExitConfirmationState$lambda58$lambda55(this.f20343b, n10, dialogInterface, i10);
                            break;
                    }
                }
            }).setOnCancelListener((DialogInterface.OnCancelListener) new com.sumsub.sns.camera.video.presentation.c(this, 3)).setOnDismissListener((DialogInterface.OnDismissListener) new com.sumsub.sns.presentation.screen.verification.d(this, n10, 1)).create();
            if (bVar != null) {
                bVar.setOnShowListener(new com.sumsub.sns.presentation.screen.verification.e(this, n10, 1));
                this.exitConfirmationDialog = bVar;
            }
        }
        bVar = null;
        this.exitConfirmationDialog = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showExitConfirmationState$lambda-58$lambda-54, reason: not valid java name */
    public static final void m83showExitConfirmationState$lambda58$lambda54(SNSVideoIdentFragment sNSVideoIdentFragment, Map map, DialogInterface dialogInterface, int i) {
        k0 appListener;
        dialogInterface.dismiss();
        sNSVideoIdentFragment.getAnalyticsDelegate().b(Screen.VideoIdentExitPopup, sNSVideoIdentFragment.getIdDocSetType(), Control.ConfirmButton, map);
        sNSVideoIdentFragment.getViewModel().Q();
        if (!com.sumsub.sns.internal.ff.a.f16930a.r().g() || (appListener = sNSVideoIdentFragment.getAppListener()) == null) {
            return;
        }
        appListener.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showExitConfirmationState$lambda-58$lambda-55, reason: not valid java name */
    public static final void m84showExitConfirmationState$lambda58$lambda55(SNSVideoIdentFragment sNSVideoIdentFragment, Map map, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        sNSVideoIdentFragment.getAnalyticsDelegate().b(Screen.VideoIdentExitPopup, sNSVideoIdentFragment.getIdDocSetType(), Control.CancelButton, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showExitConfirmationState$lambda-58$lambda-56, reason: not valid java name */
    public static final void m85showExitConfirmationState$lambda58$lambda56(SNSVideoIdentFragment sNSVideoIdentFragment, DialogInterface dialogInterface) {
        androidx.appcompat.app.b bVar = sNSVideoIdentFragment.exitConfirmationDialog;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showExitConfirmationState$lambda-58$lambda-57, reason: not valid java name */
    public static final void m86showExitConfirmationState$lambda58$lambda57(SNSVideoIdentFragment sNSVideoIdentFragment, Map map, DialogInterface dialogInterface) {
        sNSVideoIdentFragment.getAnalyticsDelegate().c(Screen.VideoIdentExitPopup, sNSVideoIdentFragment.getIdDocSetType(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showExitConfirmationState$lambda-60$lambda-59, reason: not valid java name */
    public static final void m87showExitConfirmationState$lambda60$lambda59(SNSVideoIdentFragment sNSVideoIdentFragment, Map map, DialogInterface dialogInterface) {
        sNSVideoIdentFragment.getAnalyticsDelegate().d(Screen.VideoIdentExitPopup, sNSVideoIdentFragment.getIdDocSetType(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPhoneVerificationFragment() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C0527a c0527a = new C0527a(childFragmentManager);
        c0527a.e(R$id.phone_verification_fragment, com.sumsub.sns.core.presentation.screen.verification.a.INSTANCE.a(ValidationIdentifierType.PHONE).forResult(VERIFICATION_REQUEST_KEY), null);
        c0527a.c("phone_verification_fragment");
        c0527a.i(true, true);
        getChildFragmentManager().g0(VERIFICATION_REQUEST_KEY, requireActivity(), new a(this, 0));
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.phoneVerificationBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setDraggable(true);
        }
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior2 = this.phoneVerificationBottomSheetBehavior;
        if (bottomSheetBehavior2 == null) {
            return;
        }
        bottomSheetBehavior2.setState(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPhoneVerificationFragment$lambda-23, reason: not valid java name */
    public static final void m88showPhoneVerificationFragment$lambda23(SNSVideoIdentFragment sNSVideoIdentFragment, String str, Bundle bundle) {
        sNSVideoIdentFragment.onPhoneVerificationResult(com.sumsub.sns.core.presentation.b.INSTANCE.a(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPhotoMadeAnimation(final InterfaceC0635a<O9.p> finishCallback) {
        View photoMadeIndicator = getPhotoMadeIndicator();
        if (photoMadeIndicator != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$showPhotoMadeAnimation$1$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    View photoMadeIndicator2;
                    photoMadeIndicator2 = SNSVideoIdentFragment.this.getPhotoMadeIndicator();
                    if (photoMadeIndicator2 != null) {
                        photoMadeIndicator2.setVisibility(8);
                    }
                    finishCallback.invoke();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    View photoMadeIndicator2;
                    photoMadeIndicator2 = SNSVideoIdentFragment.this.getPhotoMadeIndicator();
                    if (photoMadeIndicator2 == null) {
                        return;
                    }
                    photoMadeIndicator2.setVisibility(0);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }
            });
            photoMadeIndicator.startAnimation(alphaAnimation);
        }
    }

    private final void showRecordAudioPermissionDialog(SNSViewState.d state) {
        androidx.appcompat.app.b a10;
        if (this.lackOfPermissionDialog != null) {
            return;
        }
        com.sumsub.sns.internal.core.android.c cVar = com.sumsub.sns.internal.core.android.c.f15027a;
        ActivityC0533g requireActivity = requireActivity();
        com.sumsub.sns.internal.videoident.presentation.f d10 = state.d();
        CharSequence d11 = d10 != null ? d10.d() : null;
        com.sumsub.sns.internal.videoident.presentation.f d12 = state.d();
        CharSequence f10 = d12 != null ? d12.f() : null;
        com.sumsub.sns.internal.videoident.presentation.f d13 = state.d();
        a10 = cVar.a(requireActivity, d11, f10, d13 != null ? d13.e() : null, (r16 & 16) != 0 ? null : new InterfaceC0635a<O9.p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$showRecordAudioPermissionDialog$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public /* bridge */ /* synthetic */ O9.p invoke() {
                invoke2();
                return O9.p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.sumsub.sns.core.presentation.b.finish$default(SNSVideoIdentFragment.this, q.a.f15160b, null, null, 6, null);
            }
        }, (r16 & 32) != 0 ? null : null);
        this.lackOfPermissionDialog = a10;
        if (a10 != null) {
            a10.setOnDismissListener(new b(this, 0));
        }
        androidx.appcompat.app.b bVar = this.lackOfPermissionDialog;
        if (bVar != null) {
            bVar.show();
        }
    }

    private final void startBottomAnimation(SNSViewState.e state) {
        SNSViewState sNSViewState = this.currentViewState;
        if ((sNSViewState instanceof SNSViewState.e ? (SNSViewState.e) sNSViewState : null) == null) {
            return;
        }
        if ((!r0.I().isEmpty()) && !state.S()) {
            ViewGroup bottomSheet = getBottomSheet();
            if (bottomSheet != null) {
                H.a(bottomSheet, null);
                return;
            }
            return;
        }
        J j10 = new J();
        C0930k c0930k = new C0930k(1);
        j10.T(c0930k);
        j10.T(new C0923d());
        C0930k c0930k2 = new C0930k(2);
        c0930k2.f22694b = c0930k.f22695c;
        j10.T(c0930k2);
        ViewGroup bottomSheet2 = getBottomSheet();
        if (bottomSheet2 != null) {
            H.a(bottomSheet2, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchCameraAndUpdateMirroring() {
        SNSVideoChatController videoChatController;
        SNSVideoChatController.CameraId t3;
        SNSVideoChatService service = this.serviceConnection.getService();
        if (service == null || (videoChatController = service.getVideoChatController()) == null || (t3 = videoChatController.t()) == null) {
            return;
        }
        VideoView localVideoView = getLocalVideoView();
        if (localVideoView != null) {
            localVideoView.setMirror(t3 == SNSVideoChatController.CameraId.FRONT);
        }
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "switchCamera: " + t3, null, 4, null);
    }

    private final void updateBottomPrimaryButton(Button button, SNSViewState.e state) {
        i.a(button, !state.P());
        button.setText(state.B());
        button.setEnabled(state.A());
        button.setOnClickListener(new B7.f(20, state, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateBottomPrimaryButton$lambda-65, reason: not valid java name */
    public static final void m90updateBottomPrimaryButton$lambda65(SNSViewState.e eVar, SNSVideoIdentFragment sNSVideoIdentFragment, View view) {
        ButtonAction z10 = eVar.z();
        if (z10 != null) {
            if (z10 == ButtonAction.START_CALL) {
                sNSVideoIdentFragment.getAnalyticsDelegate().b(Screen.VideoidentScreen, sNSVideoIdentFragment.getIdDocSetType(), Control.StartButton, sNSVideoIdentFragment.getCommonPayload());
            }
            sNSVideoIdentFragment.getViewModel().a(z10);
        }
    }

    private final void updateLanguageSection(SNSViewState.e state) {
        SNSViewState.e.a.C0358a K2 = state.K();
        if ((K2 != null ? K2.e() : null) == null) {
            ViewGroup languageSection = getLanguageSection();
            if (languageSection == null) {
                return;
            }
            languageSection.setVisibility(8);
            return;
        }
        ViewGroup languageSection2 = getLanguageSection();
        if (languageSection2 != null) {
            languageSection2.setVisibility(0);
        }
        TextView languageSectionTitle = getLanguageSectionTitle();
        if (languageSectionTitle != null) {
            SNSViewState.e.a.C0358a K10 = state.K();
            i.a(languageSectionTitle, K10 != null ? K10.f() : null);
        }
        TextView language = getLanguage();
        if (language != null) {
            SNSViewState.e.a.C0358a K11 = state.K();
            i.a(language, K11 != null ? K11.e() : null);
        }
        TextView changeLanguage = getChangeLanguage();
        if (changeLanguage != null) {
            SNSViewState.e.a.C0358a K12 = state.K();
            i.a(changeLanguage, K12 != null ? K12.d() : null);
        }
        TextView changeLanguage2 = getChangeLanguage();
        if (changeLanguage2 != null) {
            changeLanguage2.setOnClickListener(new c(this, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateLanguageSection$lambda-53, reason: not valid java name */
    public static final void m91updateLanguageSection$lambda53(SNSVideoIdentFragment sNSVideoIdentFragment, View view) {
        sNSVideoIdentFragment.getAnalyticsDelegate().b(sNSVideoIdentFragment.getScreen(), sNSVideoIdentFragment.getIdDocSetType(), Control.ChangeButton, sNSVideoIdentFragment.getCommonPayload());
        sNSVideoIdentFragment.getViewModel().R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRecordTimerText() {
        SNSVideoChatController videoChatController;
        Calendar calendar = this.calendar;
        SNSVideoChatService service = this.serviceConnection.getService();
        calendar.setTimeInMillis((service == null || (videoChatController = service.getVideoChatController()) == null) ? 0L : videoChatController.h());
        TextView recordTime = getRecordTime();
        if (recordTime == null) {
            return;
        }
        recordTime.setText(this.shortTimeFormat.format(this.calendar.getTime()));
    }

    private final void updateRemoteVideoView(SNSViewState.e state, VideoTextureView remoteVideo, boolean showRemoteVideo, boolean wasHidden) {
        SNSVideoChatController videoChatController;
        SNSVideoChatController videoChatController2;
        com.sumsub.sns.internal.videoident.presentation.e O6 = state.O();
        i.b((View) remoteVideo, O6 != null && O6.f());
        com.sumsub.sns.internal.videoident.presentation.e O8 = state.O();
        TextView operatorName = getOperatorName();
        if (operatorName != null) {
            CharSequence d10 = O8 != null ? O8.d() : null;
            operatorName.setVisibility((d10 == null || C0969n.i0(d10) || !showRemoteVideo) ? 8 : 0);
        }
        TextView operatorName2 = getOperatorName();
        if (operatorName2 != null) {
            operatorName2.setText(O8 != null ? O8.d() : null);
        }
        if (showRemoteVideo && wasHidden) {
            Float f10 = this.remoteVideoScale;
            if (f10 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            applyVideoViewSize(remoteVideo, f10.floatValue());
        }
        com.sumsub.sns.internal.videoident.presentation.e O10 = state.O();
        if (O10 == null || !O10.f()) {
            SNSVideoChatService service = this.serviceConnection.getService();
            if (service != null && (videoChatController = service.getVideoChatController()) != null) {
                videoChatController.d(remoteVideo);
            }
        } else {
            SNSVideoChatService service2 = this.serviceConnection.getService();
            if (service2 != null && (videoChatController2 = service2.getVideoChatController()) != null) {
                videoChatController2.b((VideoSink) remoteVideo);
            }
        }
        View remoteVideoContainer = getRemoteVideoContainer();
        View findViewById = remoteVideoContainer != null ? remoteVideoContainer.findViewById(R$id.sns_progress_bar) : null;
        if (findViewById == null) {
            return;
        }
        com.sumsub.sns.internal.videoident.presentation.e O11 = state.O();
        findViewById.setVisibility((O11 == null || !O11.e()) ? 8 : 0);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getAppearPayload() {
        return getCompletePayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getCancelPayload() {
        return getCompletePayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getClosePayload() {
        return getCompletePayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_video_ident;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Map<String, Object> getOpenPayload() {
        return getCompletePayload();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public Screen getScreen() {
        return this.screen;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        if (event instanceof a.i) {
            requestPermission(((a.i) event).b());
        } else {
            super.handleEvent(event);
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void onCloseButtonClick() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onCloseButtonClick", null, 4, null);
        getAnalyticsDelegate().b(getScreen(), getIdDocSetType(), Control.CloseButton, getCommonPayload());
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null || (string = savedInstanceState.getString(CALL_STATE)) == null) {
            return;
        }
        AnalyticsCallState a10 = AnalyticsCallState.INSTANCE.a(string);
        if (a10 == null) {
            a10 = AnalyticsCallState.PREPARING;
        }
        this.callState = a10;
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        CoroutineScopeKt.cancel$default(this.fragmentScope, null, 1, null);
        SNSVideoChatService service = this.serviceConnection.getService();
        if (service != null) {
            detachChatControllerListeners(service.getVideoChatController());
        }
        if (this.serviceConnection.getConnected()) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleViewStateChange: disconnecting from service ...", null, 4, null);
            requireActivity().unbindService(this.serviceConnection);
        }
        super.onDestroyView();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        boolean b9 = kotlin.jvm.internal.f.b(finishReason, q.c.f15162b);
        if (b9 && hideLanguageSelection()) {
            getViewModel().b((String) null);
            return false;
        }
        if (b9 && hidePhoneVerification()) {
            getViewModel().a(PhoneVerificationStatus.CANCELED);
            return false;
        }
        if (!b9) {
            return super.onFinishCalled(finishReason);
        }
        androidx.appcompat.app.b bVar = this.exitConfirmationDialog;
        if (bVar != null) {
            bVar.show();
            return false;
        }
        getViewModel().Q();
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        com.sumsub.sns.internal.core.android.a aVar = this.pickerLifecycleObserver;
        if (aVar == null) {
            aVar = null;
        }
        String b9 = aVar.b();
        if (b9 != null) {
            outState.putString(OBSERVER_ITEM_ID, b9);
        }
        String str = this.currentCameraId;
        if (str != null) {
            outState.putString(CAMERA_ID, str);
        }
        outState.putString(CALL_STATE, this.callState.getValue());
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStart() {
        SNSVideoChatController videoChatController;
        SNSVideoChatService service;
        SNSVideoChatController videoChatController2;
        SNSVideoChatController videoChatController3;
        SNSVideoChatController videoChatController4;
        super.onStart();
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onStart", null, 4, null);
        this.previousVolumeControlStream = requireActivity().getVolumeControlStream();
        requireActivity().setVolumeControlStream(0);
        getViewModel().b0();
        SNSVideoChatService service2 = this.serviceConnection.getService();
        if (service2 != null && (videoChatController = service2.getVideoChatController()) != null) {
            VideoView localVideoView = getLocalVideoView();
            if (localVideoView != null) {
                SNSVideoChatService service3 = this.serviceConnection.getService();
                if (service3 != null && (videoChatController4 = service3.getVideoChatController()) != null) {
                    videoChatController4.a(localVideoView);
                }
                SNSVideoChatService service4 = this.serviceConnection.getService();
                if (service4 != null && (videoChatController3 = service4.getVideoChatController()) != null) {
                    videoChatController3.a(requireActivity());
                }
                String str = this.currentCameraId;
                if (str != null) {
                    SNSVideoChatController.CameraId c2 = videoChatController.c();
                    if (!kotlin.jvm.internal.f.b(c2 != null ? c2.getValue() : null, str)) {
                        switchCameraAndUpdateMirroring();
                    }
                    this.currentCameraId = null;
                }
            }
            VideoSink remoteVideoView = getRemoteVideoView();
            if (remoteVideoView != null && (service = this.serviceConnection.getService()) != null && (videoChatController2 = service.getVideoChatController()) != null) {
                videoChatController2.b(remoteVideoView);
            }
        }
        if (this.checkPermissionsOnStart) {
            requestAllPermissions();
            this.checkPermissionsOnStart = false;
        }
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStop() {
        SNSVideoChatService service;
        SNSVideoChatController videoChatController;
        SNSVideoChatController videoChatController2;
        SNSVideoChatController videoChatController3;
        SNSVideoChatController videoChatController4;
        SNSVideoChatController.CameraId c2;
        String str = null;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onStop", null, 4, null);
        requireActivity().setVolumeControlStream(this.previousVolumeControlStream);
        SNSVideoChatService service2 = this.serviceConnection.getService();
        if (service2 != null && (videoChatController4 = service2.getVideoChatController()) != null && (c2 = videoChatController4.c()) != null) {
            str = c2.getValue();
        }
        this.currentCameraId = str;
        VideoSink localVideoView = getLocalVideoView();
        if (localVideoView != null) {
            SNSVideoChatService service3 = this.serviceConnection.getService();
            if (service3 != null && (videoChatController3 = service3.getVideoChatController()) != null) {
                videoChatController3.c(localVideoView);
            }
            SNSVideoChatService service4 = this.serviceConnection.getService();
            if (service4 != null && (videoChatController2 = service4.getVideoChatController()) != null) {
                videoChatController2.q();
            }
        }
        VideoSink remoteVideoView = getRemoteVideoView();
        if (remoteVideoView != null && (service = this.serviceConnection.getService()) != null && (videoChatController = service.getVideoChatController()) != null) {
            videoChatController.d(remoteVideoView);
        }
        androidx.appcompat.app.b bVar = this.exitConfirmationDialog;
        if (bVar != null) {
            bVar.dismiss();
        }
        super.onStop();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onViewCreated: docs=" + getDocuments().size(), null, 4, null);
        super.onViewCreated(view, savedInstanceState);
        getViewModel().a(this.videoChatAdapter);
        if (savedInstanceState != null) {
            this.currentCameraId = savedInstanceState.getString(CAMERA_ID);
        }
        ViewGroup bottomSheet = getBottomSheet();
        if (bottomSheet != null) {
            BottomSheetBehavior<ViewGroup> from = BottomSheetBehavior.from(bottomSheet);
            from.setState(3);
            from.setHideable(false);
            from.setDraggable(true);
            from.setPeekHeight(getResources().getDimensionPixelSize(R$dimen.sns_margin_large));
            from.setFitToContents(false);
            if (from instanceof SNSCustomBehavior) {
                ((SNSCustomBehavior) from).setExpandedOffsetCallback(new InterfaceC0646l<CoordinatorLayout, Integer>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$onViewCreated$2$2$1
                    {
                        super(1);
                    }

                    @Override // ca.InterfaceC0646l
                    public final Integer invoke(CoordinatorLayout coordinatorLayout) {
                        int calculateExpandedOffset;
                        calculateExpandedOffset = SNSVideoIdentFragment.this.calculateExpandedOffset(coordinatorLayout);
                        return Integer.valueOf(calculateExpandedOffset);
                    }
                });
            }
            this.bottomSheetBehavior = from;
        }
        ViewGroup phoneVerificationBottomSheet = getPhoneVerificationBottomSheet();
        if (phoneVerificationBottomSheet != null) {
            BottomSheetBehavior<ViewGroup> from2 = BottomSheetBehavior.from(phoneVerificationBottomSheet);
            from2.setState(3);
            from2.setHideable(true);
            from2.setDraggable(true);
            from2.setFitToContents(false);
            from2.setExpandedOffset(0);
            from2.addBottomSheetCallback(new BottomSheetBehavior.g() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$onViewCreated$3$2$1
                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
                public void onSlide(View bottomSheet2, float slideOffset) {
                    float R = slideOffset >= 0.7f ? ha.h.R((1.0f - slideOffset) - 0.05f, 0.0f, 1.0f) : 1.0f;
                    ActivityC0533g activity = SNSVideoIdentFragment.this.getActivity();
                    View findViewById = activity != null ? activity.findViewById(R$id.sns_toolbar) : null;
                    if (findViewById == null) {
                        return;
                    }
                    findViewById.setAlpha(R);
                }

                @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
                public void onStateChanged(View bottomSheet2, int newState) {
                }
            });
            from2.setState(5);
            this.phoneVerificationBottomSheetBehavior = from2;
        }
        VideoView localVideoView = getLocalVideoView();
        if (localVideoView != null) {
            localVideoView.setMirror(true);
        }
        VideoTextureView remoteVideoView = getRemoteVideoView();
        if (remoteVideoView != null) {
            remoteVideoView.setMirror(true);
        }
        getViewModel().a(new InterfaceC0646l<Boolean, O9.p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$onViewCreated$4
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ O9.p invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return O9.p.f3034a;
            }

            public final void invoke(boolean z10) {
                Intent intent = new Intent(SNSVideoChatService.ACTION_INTERNAL_CLOSE);
                SNSVideoIdentFragment sNSVideoIdentFragment = SNSVideoIdentFragment.this;
                intent.setPackage(sNSVideoIdentFragment.requireContext().getPackageName());
                sNSVideoIdentFragment.requireContext().sendBroadcast(intent);
                if (z10) {
                    com.sumsub.sns.core.presentation.b.finish$default(SNSVideoIdentFragment.this, new q.b(false), null, null, 6, null);
                } else {
                    com.sumsub.sns.core.presentation.b.finish$default(SNSVideoIdentFragment.this, q.a.f15160b, null, null, 6, null);
                }
            }
        });
        getViewModel().b(new InterfaceC0646l<String, O9.p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$onViewCreated$5
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ O9.p invoke(String str) {
                invoke2(str);
                return O9.p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                com.sumsub.sns.internal.core.android.a aVar;
                aVar = SNSVideoIdentFragment.this.pickerLifecycleObserver;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.a(str);
            }
        });
        getViewModel().a(new InterfaceC0635a<O9.p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$onViewCreated$6
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public /* bridge */ /* synthetic */ O9.p invoke() {
                invoke2();
                return O9.p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SNSVideoIdentFragment.this.hidePhoneVerification();
            }
        });
        getViewModel().b(new InterfaceC0635a<O9.p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$onViewCreated$7
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public /* bridge */ /* synthetic */ O9.p invoke() {
                invoke2();
                return O9.p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SNSVideoIdentFragment.this.showPhoneVerificationFragment();
            }
        });
        View switchCamera = getSwitchCamera();
        if (switchCamera != null) {
            switchCamera.setOnClickListener(new c(this, 0));
        }
        com.sumsub.sns.internal.core.android.a aVar = new com.sumsub.sns.internal.core.android.a(requireActivity().getActivityResultRegistry(), getUniqueId(), com.sumsub.sns.internal.core.common.h.a(getResources().getString(R$string.sns_videoident_mime_types)), new InterfaceC0650p<String, Uri, O9.p>() { // from class: com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment$onViewCreated$9
            {
                super(2);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str, Uri uri) {
                SNSVideoIdentFragment.this.handleFileSelectedForDocSetType(str, uri);
            }

            @Override // ca.InterfaceC0650p
            public /* bridge */ /* synthetic */ O9.p invoke(String str, Uri uri) {
                invoke2(str, uri);
                return O9.p.f3034a;
            }
        }, null);
        if (savedInstanceState != null && (string = savedInstanceState.getString(OBSERVER_ITEM_ID)) != null) {
            aVar.c(string);
        }
        getLifecycle().a(aVar);
        this.pickerLifecycleObserver = aVar;
        this.permissionLauncher = registerForActivityResult(new f.f(), new a(this, 2));
    }

    @Override // com.sumsub.sns.core.presentation.b
    public h getViewModel() {
        return (h) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleState(SNSViewState state, Bundle savedInstanceState) {
        AnalyticsCallState analyticsCallState;
        VideoView localVideoView;
        Boolean bool;
        ViewGroup bottomSheet;
        int i = 1;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleState: " + state, null, 4, null);
        boolean z10 = state instanceof SNSViewState.c;
        getViewModel().b(z10);
        View view = getView();
        if (view != null) {
            view.setVisibility((z10 || (state instanceof SNSViewState.d)) ? 8 : 0);
        }
        ViewGroup languageSection = getLanguageSection();
        if (languageSection != null) {
            languageSection.setVisibility(state.isPreview() ? 0 : 8);
        }
        if (state instanceof SNSViewState.d) {
            SNSViewState.d dVar = (SNSViewState.d) state;
            if (dVar.e()) {
                showCameraPermissionDialog(dVar);
            } else if (dVar.f()) {
                showRecordAudioPermissionDialog(dVar);
            } else {
                requestAllPermissions();
            }
        }
        if (state instanceof SNSViewState.b) {
            handleSelectLanguage((SNSViewState.b) state);
        }
        SNSViewState sNSViewState = this.currentViewState;
        boolean releaseCurrentStatePreviewIfChanged = releaseCurrentStatePreviewIfChanged(state);
        this.currentViewState = state;
        boolean z11 = state instanceof SNSViewState.e;
        SNSViewState.e eVar = z11 ? (SNSViewState.e) state : null;
        if (eVar == null || (analyticsCallState = eVar.y()) == null) {
            analyticsCallState = AnalyticsCallState.PREPARING;
        }
        AnalyticsCallState analyticsCallState2 = this.callState;
        boolean z12 = analyticsCallState2 == AnalyticsCallState.COMPLETED && analyticsCallState == AnalyticsCallState.PREPARING;
        if (z10 || analyticsCallState == analyticsCallState2 || z12) {
            analyticsCallState = null;
        }
        if (analyticsCallState != null) {
            this.callState = analyticsCallState;
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleViewStateChange: callState=" + analyticsCallState, null, 4, null);
            O9.p pVar = O9.p.f3034a;
        }
        if (!z11) {
            ViewGroup bottomSheet2 = getBottomSheet();
            if (bottomSheet2 != null) {
                i.a((View) bottomSheet2, true);
                O9.p pVar2 = O9.p.f3034a;
            }
            TextView recordTime = getRecordTime();
            if (recordTime != null) {
                i.a((View) recordTime, true);
                O9.p pVar3 = O9.p.f3034a;
            }
            View switchCamera = getSwitchCamera();
            if (switchCamera != null) {
                i.a(switchCamera, true);
                O9.p pVar4 = O9.p.f3034a;
            }
            View remoteVideoContainer = getRemoteVideoContainer();
            if (remoteVideoContainer != null) {
                i.a(remoteVideoContainer, true);
                O9.p pVar5 = O9.p.f3034a;
            }
            this.exitConfirmationDialog = null;
            return;
        }
        if (state.isPreview()) {
            updateLanguageSection((SNSViewState.e) state);
        }
        SNSWarningView message = getMessage();
        if (message != null) {
            CharSequence L7 = ((SNSViewState.e) state).L();
            message.setVisibility((L7 == null || L7.length() == 0) ^ true ? 0 : 8);
        }
        SNSViewState.e eVar2 = (SNSViewState.e) state;
        if (eVar2.Q() && (bottomSheet = getBottomSheet()) != null && bottomSheet.getVisibility() == 0 && (sNSViewState instanceof SNSViewState.e)) {
            SNSViewState.e eVar3 = (SNSViewState.e) sNSViewState;
            if (eVar2.V() != eVar3.V() || eVar2.S() != eVar3.S()) {
                startBottomAnimation(eVar2);
            }
        }
        View remoteVideoContainer2 = getRemoteVideoContainer();
        boolean z13 = (remoteVideoContainer2 == null || remoteVideoContainer2.getVisibility() == 0) ? false : true;
        boolean z14 = eVar2.O() != null;
        View remoteVideoContainer3 = getRemoteVideoContainer();
        if (remoteVideoContainer3 != null) {
            remoteVideoContainer3.setVisibility(z14 ? 0 : 8);
        }
        VideoTextureView remoteVideoView = getRemoteVideoView();
        if (remoteVideoView != null) {
            updateRemoteVideoView(eVar2, remoteVideoView, z14, z13);
            O9.p pVar6 = O9.p.f3034a;
        }
        Button bottomPrimaryButton = getBottomPrimaryButton();
        if (bottomPrimaryButton != null) {
            updateBottomPrimaryButton(bottomPrimaryButton, eVar2);
            O9.p pVar7 = O9.p.f3034a;
        }
        Button bottomSecondaryButton = getBottomSecondaryButton();
        if (bottomSecondaryButton != null) {
            CharSequence C10 = eVar2.C();
            i.a(bottomSecondaryButton, C10 == null || C10.length() == 0);
            bottomSecondaryButton.setText(eVar2.C());
            bottomSecondaryButton.setOnClickListener(new c(this, i));
            O9.p pVar8 = O9.p.f3034a;
        }
        Button bottomTertiaryButton = getBottomTertiaryButton();
        if (bottomTertiaryButton != null) {
            CharSequence F10 = eVar2.F();
            i.a(bottomTertiaryButton, F10 == null || F10.length() == 0);
            bottomTertiaryButton.setText(eVar2.F());
            bottomTertiaryButton.setOnClickListener(new c(this, 2));
            O9.p pVar9 = O9.p.f3034a;
        }
        SNSWarningView message2 = getMessage();
        if (message2 != null) {
            message2.setSubtitle(eVar2.L());
            message2.setIconStart(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.NOTIFY.getImageName()));
            O9.p pVar10 = O9.p.f3034a;
        }
        TextView recordTime2 = getRecordTime();
        if (recordTime2 != null) {
            recordTime2.setVisibility(eVar2.T() ? 0 : 8);
        }
        updateRecordTimerText();
        ViewGroup documentList = getDocumentList();
        if (documentList != null) {
            i.a(documentList, eVar2.I().isEmpty());
            O9.p pVar11 = O9.p.f3034a;
        }
        ViewGroup documentList2 = getDocumentList();
        if (documentList2 != null) {
            documentList2.removeAllViews();
            if (!(!eVar2.I().isEmpty())) {
                documentList2 = null;
            }
            if (documentList2 != null) {
                populateDocumentList(documentList2, eVar2.I());
                O9.p pVar12 = O9.p.f3034a;
            }
        }
        CharSequence D2 = eVar2.D();
        boolean z15 = !(D2 == null || D2.length() == 0);
        TextView bottomText = getBottomText();
        if (bottomText != null) {
            bottomText.setVisibility(z15 ? 0 : 8);
        }
        TextView bottomText2 = getBottomText();
        if (bottomText2 != null) {
            CharSequence D10 = eVar2.D();
            bottomText2.setText(D10 != null ? i.a(D10, requireContext()) : null);
        }
        if (z15) {
            CharSequence E8 = eVar2.E();
            int dimensionPixelSize = (E8 == null || E8.length() == 0) ? 0 : getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
            TextView bottomText3 = getBottomText();
            ViewGroup.LayoutParams layoutParams = bottomText3 != null ? bottomText3.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = dimensionPixelSize;
            }
        }
        TextView bottomTitle = getBottomTitle();
        if (bottomTitle != null) {
            CharSequence E10 = eVar2.E();
            i.a(bottomTitle, E10 == null || E10.length() == 0);
            O9.p pVar13 = O9.p.f3034a;
        }
        TextView bottomTitle2 = getBottomTitle();
        if (bottomTitle2 != null) {
            bottomTitle2.setText(eVar2.E());
        }
        if (!this.serviceConnection.getConnected()) {
            StringBuilder sb2 = new StringBuilder("handleViewStateChange: localViewViewVisible=");
            VideoView localVideoView2 = getLocalVideoView();
            if (localVideoView2 != null) {
                bool = Boolean.valueOf(localVideoView2.getVisibility() == 0);
            } else {
                bool = null;
            }
            sb2.append(bool);
            sb2.append(", serviceConnected=");
            sb2.append(this.serviceConnection.getConnected());
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, sb2.toString(), null, 4, null);
        }
        if (state.getHasVideo() && ((((localVideoView = getLocalVideoView()) != null && localVideoView.getVisibility() != 0) || this.currentViewState == null) && !this.serviceConnection.getConnected())) {
            VideoView localVideoView3 = getLocalVideoView();
            if (localVideoView3 != null) {
                localVideoView3.setVisibility(8);
            }
            View switchCamera2 = getSwitchCamera();
            if (switchCamera2 != null) {
                switchCamera2.setVisibility(8);
            }
            Intent intent = new Intent(requireContext(), (Class<?>) SNSVideoChatService.class);
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleViewStateChange: connecting to service ...", null, 4, null);
            requireActivity().bindService(intent, this.serviceConnection, 1);
            return;
        }
        ViewGroup photoPreviewContainer = getPhotoPreviewContainer();
        if (photoPreviewContainer != null) {
            photoPreviewContainer.setVisibility(eVar2.M() != null ? 0 : 8);
        }
        ImageView photoPreview = getPhotoPreview();
        if (photoPreview != null) {
            s0.a(photoPreview, eVar2.M(), releaseCurrentStatePreviewIfChanged);
            O9.p pVar14 = O9.p.f3034a;
        }
        VideoView localVideoView4 = getLocalVideoView();
        if (localVideoView4 != null) {
            localVideoView4.setVisibility(eVar2.R() ? 0 : 8);
        }
        View switchCamera3 = getSwitchCamera();
        if (switchCamera3 != null) {
            switchCamera3.setVisibility(eVar2.U() ? 0 : 8);
        }
        ViewGroup bottomSheet3 = getBottomSheet();
        if (bottomSheet3 != null) {
            bottomSheet3.setVisibility(eVar2.Q() ? 0 : 8);
        }
        ViewGroup bottomSheet4 = getBottomSheet();
        if (bottomSheet4 != null) {
            bottomSheet4.setVisibility(eVar2.Q() ? 0 : 8);
        }
        View bottomProgressBar = getBottomProgressBar();
        if (bottomProgressBar != null) {
            i.a(bottomProgressBar, true ^ eVar2.S());
            O9.p pVar15 = O9.p.f3034a;
        }
        SNSWarningView bottomWarning = getBottomWarning();
        if (bottomWarning != null) {
            bottomWarning.setVisibility(eVar2.G() != null ? 0 : 8);
        }
        k G8 = eVar2.G();
        if (G8 != null) {
            SNSWarningView bottomWarning2 = getBottomWarning();
            if (bottomWarning2 != null) {
                bottomWarning2.setIconStart(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.NOTIFY.getImageName()));
            }
            SNSWarningView bottomWarning3 = getBottomWarning();
            if (bottomWarning3 != null) {
                bottomWarning3.setTitle(G8.d());
            }
            SNSWarningView bottomWarning4 = getBottomWarning();
            if (bottomWarning4 != null) {
                bottomWarning4.setSubtitle(G8.c());
            }
            O9.p pVar16 = O9.p.f3034a;
        }
        com.sumsub.sns.internal.core.common.a.b(requireActivity(), R.attr.actionBarSize);
        if (this.exitConfirmationDialog == null && eVar2.H() != null) {
            showExitConfirmationState(eVar2);
            return;
        }
        if (eVar2.H() == null) {
            androidx.appcompat.app.b bVar = this.exitConfirmationDialog;
            if (bVar != null) {
                bVar.dismiss();
                O9.p pVar17 = O9.p.f3034a;
            }
            this.exitConfirmationDialog = null;
        }
    }

    private static /* synthetic */ void getRemoteVideoScale$annotations() {
    }
}
