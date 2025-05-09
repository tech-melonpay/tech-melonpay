package o2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.bumptech.glide.load.Key;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import j2.AbstractC0892k;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import p2.InterfaceC1102c;
import s2.C1203a;

/* compiled from: JobInfoScheduler.java */
/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24340a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1102c f24341b;

    /* renamed from: c, reason: collision with root package name */
    public final SchedulerConfig f24342c;

    public C1087a(Context context, InterfaceC1102c interfaceC1102c, SchedulerConfig schedulerConfig) {
        this.f24340a = context;
        this.f24341b = interfaceC1102c;
        this.f24342c = schedulerConfig;
    }

    @Override // o2.f
    public final void a(AbstractC0892k abstractC0892k, int i, boolean z10) {
        Context context = this.f24340a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(Key.STRING_CHARSET_NAME)));
        adler32.update(abstractC0892k.b().getBytes(Charset.forName(Key.STRING_CHARSET_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(C1203a.a(abstractC0892k.d())).array());
        if (abstractC0892k.c() != null) {
            adler32.update(abstractC0892k.c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i9 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i9 >= i) {
                        j3.e.j("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC0892k);
                        return;
                    }
                }
            }
        }
        long B10 = this.f24341b.B(abstractC0892k);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority d10 = abstractC0892k.d();
        SchedulerConfig schedulerConfig = this.f24342c;
        builder.setMinimumLatency(schedulerConfig.b(d10, B10, i));
        Set<SchedulerConfig.Flag> b9 = schedulerConfig.c().get(d10).b();
        if (b9.contains(SchedulerConfig.Flag.f8962a)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (b9.contains(SchedulerConfig.Flag.f8964c)) {
            builder.setRequiresCharging(true);
        }
        if (b9.contains(SchedulerConfig.Flag.f8963b)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", abstractC0892k.b());
        persistableBundle.putInt("priority", C1203a.a(abstractC0892k.d()));
        if (abstractC0892k.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC0892k.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Log.d("TransportRuntime.".concat("JobInfoScheduler"), String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC0892k, Integer.valueOf(value), Long.valueOf(schedulerConfig.b(abstractC0892k.d(), B10, i)), Long.valueOf(B10), Integer.valueOf(i)));
        jobScheduler.schedule(builder.build());
    }

    @Override // o2.f
    public final void b(AbstractC0892k abstractC0892k, int i) {
        a(abstractC0892k, i, false);
    }
}
