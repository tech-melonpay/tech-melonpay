package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.processing.Node;
import x0.InterfaceC1579a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1579a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Node f5336b;

    public /* synthetic */ a(Node node, int i) {
        this.f5335a = i;
        this.f5336b = node;
    }

    @Override // x0.InterfaceC1579a
    public final void accept(Object obj) {
        switch (this.f5335a) {
            case 0:
                ((CaptureNode) this.f5336b).onRequestAvailable((ProcessingRequest) obj);
                break;
            case 1:
                ((CaptureNode) this.f5336b).sendCaptureError((ImageCaptureException) obj);
                break;
            default:
                ((ProcessingNode) this.f5336b).lambda$transform$1((ProcessingNode.InputPacket) obj);
                break;
        }
    }
}
