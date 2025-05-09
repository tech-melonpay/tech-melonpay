package kotlinx.coroutines.channels;

import O9.m;
import O9.p;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.channels.ReceiveChannel;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a@\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0003H\u0087H¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\u000f2\u001a\u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\f\"\u0006\u0012\u0002\b\u00030\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0087@¢\u0006\u0004\b\u0014\u0010\u0015\u001a*\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0087@¢\u0006\u0004\b\u0016\u0010\u0015\u001a \u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b\u0017\u0010\u0018\u001a\"\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b\u0019\u0010\u0018\u001a(\u0010\u001b\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00028\u0000H\u0087@¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b\u001d\u0010\u0018\u001a(\u0010\u001e\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00028\u0000H\u0087@¢\u0006\u0004\b\u001e\u0010\u001c\u001a\"\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b\u001f\u0010\u0018\u001a \u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b \u0010\u0018\u001a\"\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b!\u0010\u0018\u001a7\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&\u001aS\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0012\u0004\u0018\u00010*0'H\u0007¢\u0006\u0004\b,\u0010-\u001aS\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0012\u0004\u0018\u00010*0'H\u0001¢\u0006\u0004\b.\u0010-\u001aY\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2(\u0010+\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0012\u0004\u0018\u00010*0/H\u0007¢\u0006\u0004\b0\u00101\u001aS\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0012\u0004\u0018\u00010*0'H\u0007¢\u0006\u0004\b2\u0010-\u001a+\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020**\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0001¢\u0006\u0004\b3\u00104\u001a@\u00108\u001a\u00028\u0001\"\b\b\u0000\u0010\u0000*\u00020*\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u00028\u000005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00042\u0006\u00107\u001a\u00028\u0001H\u0087@¢\u0006\u0004\b8\u00109\u001a>\u00108\u001a\u00028\u0001\"\b\b\u0000\u0010\u0000*\u00020*\"\u000e\b\u0001\u00106*\b\u0012\u0004\u0012\u00028\u00000:*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00042\u0006\u00107\u001a\u00028\u0001H\u0087@¢\u0006\u0004\b8\u0010;\u001a7\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b<\u0010&\u001aS\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0006\u0012\u0004\u0018\u00010*0'H\u0007¢\u0006\u0004\b=\u0010-\u001a8\u0010>\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u00106*\b\u0012\u0004\u0012\u00028\u00000:*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u00107\u001a\u00028\u0001H\u0081@¢\u0006\u0004\b>\u0010;\u001a:\u0010?\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u00106*\n\u0012\u0006\b\u0000\u0012\u00028\u000005*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u00107\u001a\u00028\u0001H\u0081@¢\u0006\u0004\b?\u00109\u001a>\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C\"\u0004\b\u0000\u0010@\"\u0004\b\u0001\u0010A*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010B0\u0004H\u0087@¢\u0006\u0004\bD\u0010\u0018\u001aT\u0010D\u001a\u00028\u0002\"\u0004\b\u0000\u0010@\"\u0004\b\u0001\u0010A\"\u0018\b\u0002\u0010F*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010E*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010B0\u00042\u0006\u00107\u001a\u00028\u0002H\u0081@¢\u0006\u0004\bD\u0010G\u001a&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\bI\u0010\u0018\u001a&\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\bK\u0010\u0018\u001a_\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2(\u0010L\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040(\u0012\u0006\u0012\u0004\u0018\u00010*0'H\u0007¢\u0006\u0004\bM\u0010-\u001aY\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2\"\u0010L\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010(\u0012\u0006\u0012\u0004\u0018\u00010*0'H\u0001¢\u0006\u0004\bN\u0010-\u001a_\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2(\u0010L\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010(\u0012\u0006\u0012\u0004\u0018\u00010*0/H\u0001¢\u0006\u0004\bO\u00101\u001ae\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00020**\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2*\u0010L\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010(\u0012\u0006\u0012\u0004\u0018\u00010*0/H\u0007¢\u0006\u0004\bP\u00101\u001a_\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00020**\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2$\u0010L\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010(\u0012\u0006\u0012\u0004\u0018\u00010*0'H\u0007¢\u0006\u0004\bQ\u0010-\u001a5\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000R0\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\bS\u0010T\u001a%\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bU\u00104\u001aY\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010@*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010$\u001a\u00020#2\"\u0010V\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010(\u0012\u0006\u0012\u0004\u0018\u00010*0'H\u0001¢\u0006\u0004\bW\u0010-\u001a&\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000X\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081@¢\u0006\u0004\bY\u0010\u0018\u001a \u0010Z\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\bZ\u0010\u0018\u001a \u0010[\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b[\u0010\u0018\u001a>\u0010_\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0010^\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\\j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`]H\u0087@¢\u0006\u0004\b_\u0010`\u001a>\u0010a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0010^\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\\j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`]H\u0087@¢\u0006\u0004\ba\u0010`\u001a \u0010b\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\bb\u0010\u0018\u001a+\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020**\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0007¢\u0006\u0004\bc\u00104\u001aF\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010B0\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0004¢\u0006\u0004\be\u0010f\u001ac\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010A*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\b\u0002\u0010$\u001a\u00020#2\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020'H\u0001¢\u0006\u0004\be\u0010g\u001a)\u0010h\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\u000f*\u0006\u0012\u0002\b\u00030\u0004H\u0001¢\u0006\u0004\bh\u0010i¨\u0006j"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "block", "consume", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lca/l;)Ljava/lang/Object;", "LO9/p;", "action", "consumeEach", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lca/l;LT9/a;)Ljava/lang/Object;", "", "channels", "", "Lkotlinx/coroutines/CompletionHandler;", "consumesAll", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lca/l;", "", FirebaseAnalytics.Param.INDEX, "elementAt", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILT9/a;)Ljava/lang/Object;", "elementAtOrNull", "first", "(Lkotlinx/coroutines/channels/ReceiveChannel;LT9/a;)Ljava/lang/Object;", "firstOrNull", "element", "indexOf", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;LT9/a;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", "single", "singleOrNull", "n", "Lkotlin/coroutines/d;", "context", "drop", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/d;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlin/Function2;", "LT9/a;", "", "", "predicate", "dropWhile", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/d;Lca/p;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filter", "Lkotlin/Function3;", "filterIndexed", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/d;Lca/q;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "(Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlinx/coroutines/channels/ReceiveChannel;", "", "C", FirebaseAnalytics.Param.DESTINATION, "filterNotNullTo", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;LT9/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;LT9/a;)Ljava/lang/Object;", "take", "takeWhile", "toChannel", "toCollection", "K", "V", "Lkotlin/Pair;", "", "toMap", "", "M", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;LT9/a;)Ljava/lang/Object;", "", "toMutableList", "", "toSet", "transform", "flatMap", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "LP9/u;", "withIndex", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/d;)Lkotlinx/coroutines/channels/ReceiveChannel;", "distinct", "selector", "distinctBy", "", "toMutableSet", "any", "count", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "maxWith", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;LT9/a;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "other", "zip", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlinx/coroutines/channels/ReceiveChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/d;Lca/p;)Lkotlinx/coroutines/channels/ReceiveChannel;", "consumes", "(Lkotlinx/coroutines/channels/ReceiveChannel;)Lca/l;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 0, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes2.dex */
final /* synthetic */ class ChannelsKt__DeprecatedKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel r4, T9.a r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.b.b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L47
        L2b:
            r5 = move-exception
            goto L4c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.b.b(r5)
            kotlinx.coroutines.channels.ChannelIterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2b
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2b
            r0.label = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r0)
            return r5
        L4c:
            throw r5     // Catch: java.lang.Throwable -> L4d
        L4d:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.any(kotlinx.coroutines.channels.ReceiveChannel, T9.a):java.lang.Object");
    }

    @ObsoleteCoroutinesApi
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, InterfaceC0646l<? super ReceiveChannel<? extends E>, ? extends R> interfaceC0646l) {
        ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
        try {
            return interfaceC0646l.invoke(openSubscription);
        } finally {
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) openSubscription, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:15:0x0063, B:17:0x006b, B:29:0x0078), top: B:14:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #2 {all -> 0x0075, blocks: (B:15:0x0063, B:17:0x006b, B:29:0x0078), top: B:14:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005f -> B:13:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> r6, ca.InterfaceC0646l<? super E, O9.p> r7, T9.a<? super O9.p> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            ca.l r2 = (ca.InterfaceC0646l) r2
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L38
            r5 = r0
            r0 = r7
            r7 = r2
        L36:
            r2 = r5
            goto L63
        L38:
            r6 = move-exception
            goto L87
        L3a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L42:
            kotlin.b.b(r8)
            kotlinx.coroutines.channels.ReceiveChannel r6 = r6.openSubscription()
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L83
            r5 = r8
            r8 = r6
            r6 = r5
        L50:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L80
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L80
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L80
            r0.label = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L80
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L36
        L63:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L75
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L78
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L75
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L75
            r8 = r0
            r0 = r2
            goto L50
        L75:
            r6 = move-exception
            r7 = r0
            goto L87
        L78:
            O9.p r6 = O9.p.f3034a     // Catch: java.lang.Throwable -> L75
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r0, r3, r4, r3)
            O9.p r6 = O9.p.f3034a
            return r6
        L80:
            r6 = move-exception
            r7 = r8
            goto L87
        L83:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L87:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r7, r3, r4, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumeEach(kotlinx.coroutines.channels.BroadcastChannel, ca.l, T9.a):java.lang.Object");
    }

    private static final <E> Object consumeEach$$forInline(BroadcastChannel<E> broadcastChannel, InterfaceC0646l<? super E, p> interfaceC0646l, T9.a<? super p> aVar) {
        ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
        try {
            ChannelIterator<E> it = openSubscription.iterator();
            while (((Boolean) it.hasNext(null)).booleanValue()) {
                interfaceC0646l.invoke(it.next());
            }
            p pVar = p.f3034a;
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) openSubscription, (CancellationException) null, 1, (Object) null);
            return p.f3034a;
        } catch (Throwable th) {
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) openSubscription, (CancellationException) null, 1, (Object) null);
            throw th;
        }
    }

    public static final InterfaceC0646l<Throwable, p> consumes(ReceiveChannel<?> receiveChannel) {
        return new d(receiveChannel, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p consumes$lambda$24$ChannelsKt__DeprecatedKt(ReceiveChannel receiveChannel, Throwable th) {
        ChannelsKt.cancelConsumed(receiveChannel, th);
        return p.f3034a;
    }

    public static final InterfaceC0646l<Throwable, p> consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return new d(receiveChannelArr, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p consumesAll$lambda$2$ChannelsKt__DeprecatedKt(ReceiveChannel[] receiveChannelArr, Throwable th) {
        Throwable th2 = null;
        for (ReceiveChannel receiveChannel : receiveChannelArr) {
            try {
                ChannelsKt.cancelConsumed(receiveChannel, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    m.a(th2, th3);
                }
            }
        }
        if (th2 == null) {
            return p.f3034a;
        }
        throw th2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:30:0x0070), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:30:0x0070), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel r6, T9.a r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            java.lang.Object r4 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref$IntRef) r4
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r6 = move-exception
            goto L84
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.b.b(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
            r7.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> L81
            r4 = r7
            r7 = r6
            r6 = r2
        L4c:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L7e
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L7e
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L7e
            r0.label = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L7e
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r5 = r2
            r2 = r7
            r7 = r5
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L33
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L70
            r6.next()     // Catch: java.lang.Throwable -> L33
            int r7 = r4.f23177a     // Catch: java.lang.Throwable -> L33
            int r7 = r7 + r3
            r4.f23177a = r7     // Catch: java.lang.Throwable -> L33
            r7 = r2
            goto L4c
        L70:
            O9.p r6 = O9.p.f3034a     // Catch: java.lang.Throwable -> L33
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            int r6 = r4.f23177a
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        L7e:
            r6 = move-exception
            r2 = r7
            goto L84
        L81:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L84:
            throw r6     // Catch: java.lang.Throwable -> L85
        L85:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.count(kotlinx.coroutines.channels.ReceiveChannel, T9.a):java.lang.Object");
    }

    public static final /* synthetic */ ReceiveChannel distinct(ReceiveChannel receiveChannel) {
        ReceiveChannel distinctBy$default;
        distinctBy$default = distinctBy$default(receiveChannel, null, new ChannelsKt__DeprecatedKt$distinct$1(null), 1, null);
        return distinctBy$default;
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p<? super E, ? super T9.a<? super K>, ? extends Object> interfaceC0650p) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$distinctBy$1(receiveChannel, interfaceC0650p, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.distinctBy(receiveChannel, dVar, interfaceC0650p);
    }

    public static final /* synthetic */ ReceiveChannel drop(ReceiveChannel receiveChannel, int i, kotlin.coroutines.d dVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$drop$1(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel receiveChannel, int i, kotlin.coroutines.d dVar, int i9, Object obj) {
        ReceiveChannel drop;
        if ((i9 & 2) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        drop = drop(receiveChannel, i, dVar);
        return drop;
    }

    public static final /* synthetic */ ReceiveChannel dropWhile(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$dropWhile$1(receiveChannel, interfaceC0650p, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        ReceiveChannel dropWhile;
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        dropWhile = dropWhile(receiveChannel, dVar, interfaceC0650p);
        return dropWhile;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:13:0x0062, B:15:0x006a, B:26:0x007b, B:27:0x0092), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:13:0x0062, B:15:0x006a, B:26:0x007b, B:27:0x0092), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005d -> B:13:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel r9, int r10, T9.a r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 46
            r4 = 1
            java.lang.String r5 = "ReceiveChannel doesn't contain element at index "
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L37
            goto L62
        L37:
            r9 = move-exception
            goto Lac
        L3a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L42:
            kotlin.b.b(r11)
            if (r10 < 0) goto L97
            kotlinx.coroutines.channels.ChannelIterator r11 = r9.iterator()     // Catch: java.lang.Throwable -> L93
            r2 = 0
        L4c:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L93
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L93
            r0.I$0 = r10     // Catch: java.lang.Throwable -> L93
            r0.I$1 = r2     // Catch: java.lang.Throwable -> L93
            r0.label = r4     // Catch: java.lang.Throwable -> L93
            java.lang.Object r6 = r11.hasNext(r0)     // Catch: java.lang.Throwable -> L93
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r8 = r6
            r6 = r9
            r9 = r2
            r2 = r11
            r11 = r8
        L62:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L37
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r11 == 0) goto L7b
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L37
            int r7 = r9 + 1
            if (r10 != r9) goto L77
            r9 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r9)
            return r11
        L77:
            r11 = r2
            r9 = r6
            r2 = r7
            goto L4c
        L7b:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r11.<init>()     // Catch: java.lang.Throwable -> L37
            r11.append(r5)     // Catch: java.lang.Throwable -> L37
            r11.append(r10)     // Catch: java.lang.Throwable -> L37
            r11.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L37
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L37
        L93:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto Lac
        L97:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L93
            r0.append(r10)     // Catch: java.lang.Throwable -> L93
            r0.append(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L93
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L93
            throw r11     // Catch: java.lang.Throwable -> L93
        Lac:
            throw r9     // Catch: java.lang.Throwable -> Lad
        Lad:
            r10 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAt(kotlinx.coroutines.channels.ReceiveChannel, int, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #2 {all -> 0x007e, blocks: (B:13:0x0066, B:15:0x006e, B:22:0x0051, B:46:0x004c), top: B:45:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0062 -> B:13:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel r8, int r9, T9.a r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r5 = (kotlinx.coroutines.channels.ReceiveChannel) r5
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L39
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r0
            r0 = r7
            goto L66
        L39:
            r8 = move-exception
            goto L86
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            kotlin.b.b(r10)
            if (r9 >= 0) goto L4c
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r4
        L4c:
            kotlinx.coroutines.channels.ChannelIterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> L7e
            r2 = 0
        L51:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L7e
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L7e
            r0.I$0 = r9     // Catch: java.lang.Throwable -> L7e
            r0.I$1 = r2     // Catch: java.lang.Throwable -> L7e
            r0.label = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r5 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> L7e
            if (r5 != r1) goto L62
            return r1
        L62:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r7
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L7e
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L7e
            if (r10 == 0) goto L82
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L7e
            int r6 = r2 + 1
            if (r9 != r2) goto L7a
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r10
        L7a:
            r10 = r0
            r0 = r5
            r2 = r6
            goto L51
        L7e:
            r9 = move-exception
            r5 = r8
            r8 = r9
            goto L86
        L82:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r4)
            return r4
        L86:
            throw r8     // Catch: java.lang.Throwable -> L87
        L87:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel, int, T9.a):java.lang.Object");
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p<? super E, ? super T9.a<? super Boolean>, ? extends Object> interfaceC0650p) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$filter$1(receiveChannel, interfaceC0650p, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.filter(receiveChannel, dVar, interfaceC0650p);
    }

    public static final /* synthetic */ ReceiveChannel filterIndexed(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0651q interfaceC0651q) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$filterIndexed$1(receiveChannel, interfaceC0651q, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0651q interfaceC0651q, int i, Object obj) {
        ReceiveChannel filterIndexed;
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        filterIndexed = filterIndexed(receiveChannel, dVar, interfaceC0651q);
        return filterIndexed;
    }

    public static final /* synthetic */ ReceiveChannel filterNot(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p) {
        return ChannelsKt.filter(receiveChannel, dVar, new ChannelsKt__DeprecatedKt$filterNot$1(interfaceC0650p, null));
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        ReceiveChannel filterNot;
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        filterNot = filterNot(receiveChannel, dVar, interfaceC0650p);
        return filterNot;
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        ReceiveChannel<E> filter$default;
        filter$default = filter$default(receiveChannel, null, new ChannelsKt__DeprecatedKt$filterNotNull$1(null), 1, null);
        return filter$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005a, B:14:0x0062, B:16:0x0068, B:18:0x0048, B:23:0x006d), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005a, B:14:0x0062, B:16:0x0068, B:18:0x0048, B:23:0x006d), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0057 -> B:12:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r5, java.util.Collection r6, T9.a r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L33
            goto L5a
        L33:
            r5 = move-exception
            goto L78
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.b.b(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L74
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L48:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L33
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L33
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L33
            r0.label = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L57
            return r1
        L57:
            r4 = r2
            r2 = r7
            r7 = r4
        L5a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L33
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L6b
            r2.add(r7)     // Catch: java.lang.Throwable -> L33
        L6b:
            r7 = r2
            goto L48
        L6d:
            O9.p r5 = O9.p.f3034a     // Catch: java.lang.Throwable -> L33
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r2
        L74:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L78:
            throw r5     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0051, B:14:0x0059, B:18:0x0062, B:19:0x0069), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #2 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0051, B:14:0x0059, B:18:0x0062, B:19:0x0069), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel r5, T9.a r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L2f
            goto L51
        L2f:
            r5 = move-exception
            goto L6d
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.b.b(r6)
            kotlinx.coroutines.channels.ChannelIterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6a
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L6a
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L6a
            r0.label = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L51:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2f
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L62
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r6)
            return r5
        L62:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2f
            throw r5     // Catch: java.lang.Throwable -> L2f
        L6a:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6d:
            throw r5     // Catch: java.lang.Throwable -> L6e
        L6e:
            r6 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.first(kotlinx.coroutines.channels.ReceiveChannel, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0051, B:18:0x005e), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel r5, T9.a r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L2f
            goto L51
        L2f:
            r5 = move-exception
            goto L69
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.b.b(r6)
            kotlinx.coroutines.channels.ChannelIterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L66
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L66
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L66
            r0.label = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L66
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L51:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2f
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r6 != 0) goto L5e
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r1)
            return r1
        L5e:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L2f
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r1)
            return r5
        L66:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L69:
            throw r5     // Catch: java.lang.Throwable -> L6a
        L6a:
            r6 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.firstOrNull(kotlinx.coroutines.channels.ReceiveChannel, T9.a):java.lang.Object");
    }

    public static final /* synthetic */ ReceiveChannel flatMap(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$flatMap$1(receiveChannel, interfaceC0650p, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        ReceiveChannel flatMap;
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        flatMap = flatMap(receiveChannel, dVar, interfaceC0650p);
        return flatMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0065, B:14:0x006e, B:16:0x0078, B:20:0x0083, B:21:0x0051, B:25:0x008a), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0065, B:14:0x006e, B:16:0x0078, B:20:0x0083, B:21:0x0051, B:25:0x008a), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0062 -> B:12:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, T9.a r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref$IntRef) r2
            java.lang.Object r4 = r0.L$0
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L35
            goto L65
        L35:
            r7 = move-exception
            goto L9a
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            kotlin.b.b(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            kotlinx.coroutines.channels.ChannelIterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L96
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L51:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L35
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L35
            r0.L$3 = r7     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r4 != r1) goto L62
            return r1
        L62:
            r6 = r4
            r4 = r9
            r9 = r6
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L35
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L35
            r5 = 0
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L35
            boolean r9 = kotlin.jvm.internal.f.b(r4, r9)     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L83
            int r7 = r2.f23177a     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r9 = new java.lang.Integer     // Catch: java.lang.Throwable -> L35
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r5)
            return r9
        L83:
            int r9 = r2.f23177a     // Catch: java.lang.Throwable -> L35
            int r9 = r9 + r3
            r2.f23177a = r9     // Catch: java.lang.Throwable -> L35
            r9 = r4
            goto L51
        L8a:
            O9.p r7 = O9.p.f3034a     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r5)
            java.lang.Integer r7 = new java.lang.Integer
            r8 = -1
            r7.<init>(r8)
            return r7
        L96:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9a:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.indexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:13:0x0089, B:15:0x0091), top: B:11:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #2 {all -> 0x004c, blocks: (B:40:0x0048, B:41:0x0067, B:43:0x006f, B:45:0x00a0, B:46:0x00a7), top: B:39:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0 A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #2 {all -> 0x004c, blocks: (B:40:0x0048, B:41:0x0067, B:43:0x006f, B:45:0x00a0, B:46:0x00a7), top: B:39:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0085 -> B:13:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel r6, T9.a r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L34
            goto L89
        L34:
            r6 = move-exception
            r2 = r4
            goto La8
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L4c
            goto L67
        L4c:
            r6 = move-exception
            goto La8
        L4f:
            kotlin.b.b(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9c
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9c
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9c
            r0.label = r4     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L9c
            if (r2 != r1) goto L63
            return r1
        L63:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L67:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4c
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto La0
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4c
            r5 = r2
            r2 = r6
            r6 = r5
        L76:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9c
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L9c
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L9c
            r0.label = r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L9c
            if (r4 != r1) goto L85
            return r1
        L85:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L89:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L34
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L97
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L34
            r6 = r4
            goto L76
        L97:
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r7)
            return r6
        L9c:
            r7 = move-exception
            r2 = r6
            r6 = r7
            goto La8
        La0:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4c
            throw r6     // Catch: java.lang.Throwable -> L4c
        La8:
            throw r6     // Catch: java.lang.Throwable -> La9
        La9:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.last(kotlinx.coroutines.channels.ReceiveChannel, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0073, B:14:0x007b, B:16:0x0085, B:17:0x0089, B:18:0x005d, B:23:0x0090), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0073, B:14:0x007b, B:16:0x0085, B:17:0x0089, B:18:0x005d, B:23:0x0090), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0070 -> B:12:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel r7, java.lang.Object r8, T9.a r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.L$4
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref$IntRef) r2
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.Ref$IntRef r4 = (kotlin.jvm.internal.Ref$IntRef) r4
            java.lang.Object r5 = r0.L$0
            kotlin.b.b(r9)     // Catch: java.lang.Throwable -> L39
            goto L73
        L39:
            r7 = move-exception
            goto La2
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            kotlin.b.b(r9)
            kotlin.jvm.internal.Ref$IntRef r9 = new kotlin.jvm.internal.Ref$IntRef
            r9.<init>()
            r2 = -1
            r9.f23177a = r2
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.channels.ChannelIterator r4 = r7.iterator()     // Catch: java.lang.Throwable -> L9e
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L5d:
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L39
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L39
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L39
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L39
            r0.L$4 = r7     // Catch: java.lang.Throwable -> L39
            r0.label = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L39
            if (r5 != r1) goto L70
            return r1
        L70:
            r6 = r5
            r5 = r9
            r9 = r6
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L39
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r9 == 0) goto L90
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L39
            boolean r9 = kotlin.jvm.internal.f.b(r5, r9)     // Catch: java.lang.Throwable -> L39
            if (r9 == 0) goto L89
            int r9 = r2.f23177a     // Catch: java.lang.Throwable -> L39
            r4.f23177a = r9     // Catch: java.lang.Throwable -> L39
        L89:
            int r9 = r2.f23177a     // Catch: java.lang.Throwable -> L39
            int r9 = r9 + r3
            r2.f23177a = r9     // Catch: java.lang.Throwable -> L39
            r9 = r5
            goto L5d
        L90:
            O9.p r7 = O9.p.f3034a     // Catch: java.lang.Throwable -> L39
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            int r7 = r4.f23177a
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        L9e:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La2:
            throw r7     // Catch: java.lang.Throwable -> La3
        La3:
            r9 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x0031, B:13:0x008d, B:15:0x0095), top: B:11:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:40:0x0049, B:41:0x0067, B:45:0x0073), top: B:39:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0089 -> B:13:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, T9.a r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.L$2
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L35
            goto L8d
        L35:
            r7 = move-exception
            r2 = r4
            goto La2
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L4d
            goto L67
        L4d:
            r7 = move-exception
            goto La2
        L4f:
            kotlin.b.b(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L9f
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9f
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9f
            r0.label = r4     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L9f
            if (r2 != r1) goto L63
            return r1
        L63:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4d
            if (r8 != 0) goto L73
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r5)
            return r5
        L73:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4d
            r6 = r2
            r2 = r7
            r7 = r6
        L7a:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L9f
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L9f
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L9f
            r0.label = r3     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r4 = r2.hasNext(r0)     // Catch: java.lang.Throwable -> L9f
            if (r4 != r1) goto L89
            return r1
        L89:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L8d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L35
            r7 = r4
            goto L7a
        L9b:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            return r7
        L9f:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La2:
            throw r7     // Catch: java.lang.Throwable -> La3
        La3:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.lastOrNull(kotlinx.coroutines.channels.ReceiveChannel, T9.a):java.lang.Object");
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p<? super E, ? super T9.a<? super R>, ? extends Object> interfaceC0650p) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$map$1(receiveChannel, interfaceC0650p, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.map(receiveChannel, dVar, interfaceC0650p);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.d dVar, InterfaceC0651q<? super Integer, ? super E, ? super T9.a<? super R>, ? extends Object> interfaceC0651q) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$mapIndexed$1(receiveChannel, interfaceC0651q, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0651q interfaceC0651q, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.mapIndexed(receiveChannel, dVar, interfaceC0651q);
    }

    public static final /* synthetic */ ReceiveChannel mapIndexedNotNull(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0651q interfaceC0651q) {
        return ChannelsKt.filterNotNull(ChannelsKt.mapIndexed(receiveChannel, dVar, interfaceC0651q));
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0651q interfaceC0651q, int i, Object obj) {
        ReceiveChannel mapIndexedNotNull;
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        mapIndexedNotNull = mapIndexedNotNull(receiveChannel, dVar, interfaceC0651q);
        return mapIndexedNotNull;
    }

    public static final /* synthetic */ ReceiveChannel mapNotNull(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p) {
        return ChannelsKt.filterNotNull(ChannelsKt.map(receiveChannel, dVar, interfaceC0650p));
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        ReceiveChannel mapNotNull;
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        mapNotNull = mapNotNull(receiveChannel, dVar, interfaceC0650p);
        return mapNotNull;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, blocks: (B:15:0x00a1, B:17:0x00a9, B:20:0x008c, B:55:0x0060), top: B:54:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084 A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005a, blocks: (B:44:0x0056, B:45:0x0078, B:49:0x0084), top: B:43:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009d -> B:14:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, T9.a r10) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.maxWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, blocks: (B:15:0x00a1, B:17:0x00a9, B:20:0x008c, B:55:0x0060), top: B:54:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084 A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005a, blocks: (B:44:0x0056, B:45:0x0078, B:49:0x0084), top: B:43:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009d -> B:14:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel r8, java.util.Comparator r9, T9.a r10) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.minWith(kotlinx.coroutines.channels.ReceiveChannel, java.util.Comparator, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel r4, T9.a r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r4 = (kotlinx.coroutines.channels.ReceiveChannel) r4
            kotlin.b.b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L47
        L2b:
            r5 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.b.b(r5)
            kotlinx.coroutines.channels.ChannelIterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2b
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2b
            r0.label = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L2b
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L2b
            r0 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r0)
            return r5
        L57:
            throw r5     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.none(kotlinx.coroutines.channels.ReceiveChannel, T9.a):java.lang.Object");
    }

    public static final /* synthetic */ ReceiveChannel requireNoNulls(ReceiveChannel receiveChannel) {
        ReceiveChannel map$default;
        map$default = map$default(receiveChannel, null, new ChannelsKt__DeprecatedKt$requireNoNulls$1(receiveChannel, null), 1, null);
        return map$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #1 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x007f, B:18:0x008c, B:19:0x0093), top: B:11:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:33:0x0044, B:34:0x0062, B:36:0x006a, B:40:0x0094, B:41:0x009b), top: B:32:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094 A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #2 {all -> 0x0048, blocks: (B:33:0x0044, B:34:0x0062, B:36:0x006a, B:40:0x0094, B:41:0x009b), top: B:32:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel r6, T9.a r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L30
            goto L7f
        L30:
            r6 = move-exception
            r2 = r0
            goto L9f
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L48
            goto L62
        L48:
            r6 = move-exception
            goto L9f
        L4a:
            kotlin.b.b(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L9c
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9c
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L9c
            r0.label = r4     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L9c
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L62:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L48
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L94
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L48
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L48
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L48
            r0.label = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L48
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L7f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L30
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L8c
            r7 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r7)
            return r6
        L8c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L30
            throw r6     // Catch: java.lang.Throwable -> L30
        L94:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L48
            throw r6     // Catch: java.lang.Throwable -> L48
        L9c:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L9f:
            throw r6     // Catch: java.lang.Throwable -> La0
        La0:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.single(kotlinx.coroutines.channels.ReceiveChannel, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f A[Catch: all -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0049, blocks: (B:33:0x0045, B:34:0x0063, B:38:0x006f), top: B:32:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel r7, T9.a r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L84
        L31:
            r7 = move-exception
            r2 = r0
            goto L97
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L49
            goto L63
        L49:
            r7 = move-exception
            goto L97
        L4b:
            kotlin.b.b(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L94
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L94
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L94
            r0.label = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L94
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L63:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L49
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L49
            if (r8 != 0) goto L6f
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r5)
            return r5
        L6f:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L49
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L49
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L49
            r0.label = r3     // Catch: java.lang.Throwable -> L49
            java.lang.Object r7 = r7.hasNext(r0)     // Catch: java.lang.Throwable -> L49
            if (r7 != r1) goto L80
            return r1
        L80:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L84:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L31
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L90
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            return r5
        L90:
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r0, r5)
            return r7
        L94:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L97:
            throw r7     // Catch: java.lang.Throwable -> L98
        L98:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.singleOrNull(kotlinx.coroutines.channels.ReceiveChannel, T9.a):java.lang.Object");
    }

    public static final /* synthetic */ ReceiveChannel take(ReceiveChannel receiveChannel, int i, kotlin.coroutines.d dVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$take$1(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel receiveChannel, int i, kotlin.coroutines.d dVar, int i9, Object obj) {
        ReceiveChannel take;
        if ((i9 & 2) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        take = take(receiveChannel, i, dVar);
        return take;
    }

    public static final /* synthetic */ ReceiveChannel takeWhile(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$takeWhile$1(receiveChannel, interfaceC0650p, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        ReceiveChannel takeWhile;
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        takeWhile = takeWhile(receiveChannel, dVar, interfaceC0650p);
        return takeWhile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0032, B:19:0x006e, B:21:0x0076, B:24:0x0089, B:40:0x004f), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0032, B:19:0x006e, B:21:0x0076, B:24:0x0089, B:40:0x004f), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.SendChannel<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0086 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, C r7, T9.a<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L39
        L35:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5a
        L39:
            r6 = move-exception
            goto L94
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L39
            goto L6e
        L53:
            kotlin.b.b(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L90
        L5a:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L90
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L90
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L90
            r0.label = r4     // Catch: java.lang.Throwable -> L90
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L90
            if (r2 != r1) goto L69
            return r1
        L69:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L6e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L89
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L39
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L39
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L39
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L39
            r0.label = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L39
            if (r8 != r1) goto L35
            return r1
        L89:
            O9.p r6 = O9.p.f3034a     // Catch: java.lang.Throwable -> L39
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r2
        L90:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L94:
            throw r6     // Catch: java.lang.Throwable -> L95
        L95:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toChannel(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, T9.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005a, B:14:0x0062, B:15:0x0048, B:20:0x006b), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005a, B:14:0x0062, B:15:0x0048, B:20:0x006b), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:12:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r5, C r6, T9.a<? super C> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r5 = (kotlinx.coroutines.channels.ChannelIterator) r5
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r2 = r0.L$0
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.b.b(r7)     // Catch: java.lang.Throwable -> L33
            goto L5a
        L33:
            r5 = move-exception
            goto L76
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.b.b(r7)
            kotlinx.coroutines.channels.ChannelIterator r7 = r5.iterator()     // Catch: java.lang.Throwable -> L72
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L48:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L33
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L33
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L33
            r0.label = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r5.hasNext(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L57
            return r1
        L57:
            r4 = r2
            r2 = r7
            r7 = r4
        L5a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L33
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L33
            r2.add(r7)     // Catch: java.lang.Throwable -> L33
            r7 = r2
            goto L48
        L6b:
            O9.p r5 = O9.p.f3034a     // Catch: java.lang.Throwable -> L33
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            return r2
        L72:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L76:
            throw r5     // Catch: java.lang.Throwable -> L77
        L77:
            r7 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toCollection(kotlinx.coroutines.channels.ReceiveChannel, java.util.Collection, T9.a):java.lang.Object");
    }

    public static final /* synthetic */ Object toMap(ReceiveChannel receiveChannel, T9.a aVar) {
        return ChannelsKt.toMap(receiveChannel, new LinkedHashMap(), aVar);
    }

    public static final /* synthetic */ Object toMutableList(ReceiveChannel receiveChannel, T9.a aVar) {
        return ChannelsKt.toCollection(receiveChannel, new ArrayList(), aVar);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, T9.a<? super Set<E>> aVar) {
        return ChannelsKt.toCollection(receiveChannel, new LinkedHashSet(), aVar);
    }

    public static final /* synthetic */ ReceiveChannel withIndex(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumes(receiveChannel), new ChannelsKt__DeprecatedKt$withIndex$1(receiveChannel, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel receiveChannel, kotlin.coroutines.d dVar, int i, Object obj) {
        ReceiveChannel withIndex;
        if ((i & 1) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        withIndex = withIndex(receiveChannel, dVar);
        return withIndex;
    }

    public static final /* synthetic */ ReceiveChannel zip(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2) {
        ReceiveChannel zip$default;
        zip$default = zip$default(receiveChannel, receiveChannel2, null, new e(), 2, null);
        return zip$default;
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, kotlin.coroutines.d dVar, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 2) != 0) {
            dVar = Dispatchers.getUnconfined();
        }
        return ChannelsKt.zip(receiveChannel, receiveChannel2, dVar, interfaceC0650p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair zip$lambda$23$ChannelsKt__DeprecatedKt(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005a, B:14:0x0062, B:15:0x0048, B:20:0x0071), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005a, B:14:0x0062, B:15:0x0048, B:20:0x0071), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:12:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> r6, M r7, T9.a<? super M> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            java.util.Map r2 = (java.util.Map) r2
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L33
            goto L5a
        L33:
            r6 = move-exception
            goto L7c
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.b.b(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L78
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L48:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L33
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L33
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L33
            r0.label = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r6.hasNext(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L57
            return r1
        L57:
            r5 = r2
            r2 = r8
            r8 = r5
        L5a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L71
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L33
            kotlin.Pair r8 = (kotlin.Pair) r8     // Catch: java.lang.Throwable -> L33
            A r4 = r8.f23089a     // Catch: java.lang.Throwable -> L33
            B r8 = r8.f23090b     // Catch: java.lang.Throwable -> L33
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L33
            r8 = r2
            goto L48
        L71:
            O9.p r6 = O9.p.f3034a     // Catch: java.lang.Throwable -> L33
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r2
        L78:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L7c:
            throw r6     // Catch: java.lang.Throwable -> L7d
        L7d:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.toMap(kotlinx.coroutines.channels.ReceiveChannel, java.util.Map, T9.a):java.lang.Object");
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, kotlin.coroutines.d dVar, InterfaceC0650p<? super E, ? super R, ? extends V> interfaceC0650p) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, dVar, 0, null, ChannelsKt.consumesAll(receiveChannel, receiveChannel2), new ChannelsKt__DeprecatedKt$zip$2(receiveChannel2, receiveChannel, interfaceC0650p, null), 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0032, B:19:0x006c, B:21:0x0074, B:23:0x007a, B:26:0x008d, B:42:0x004d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0032, B:19:0x006c, B:21:0x0074, B:23:0x007a, B:26:0x008d, B:42:0x004d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:13:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0086 -> B:13:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel r6, kotlinx.coroutines.channels.SendChannel r7, T9.a r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 r0 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L51
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L36
            goto L89
        L36:
            r6 = move-exception
            goto L98
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L36
            goto L6c
        L51:
            kotlin.b.b(r8)
            kotlinx.coroutines.channels.ChannelIterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L94
        L58:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L94
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L94
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L94
            r0.label = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r8.hasNext(r0)     // Catch: java.lang.Throwable -> L94
            if (r2 != r1) goto L67
            return r1
        L67:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L6c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L36
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L89
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L36
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L36
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L36
            r0.label = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = r2.send(r8, r0)     // Catch: java.lang.Throwable -> L36
            if (r8 != r1) goto L89
            return r1
        L89:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L58
        L8d:
            O9.p r6 = O9.p.f3034a     // Catch: java.lang.Throwable -> L36
            r6 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            return r2
        L94:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L98:
            throw r6     // Catch: java.lang.Throwable -> L99
        L99:
            r8 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel, kotlinx.coroutines.channels.SendChannel, T9.a):java.lang.Object");
    }
}
