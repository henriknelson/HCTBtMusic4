package android.microntek;

import android.os.Bundle;
import android.os.RemoteException;

public interface CarListener {
    void onStatusChanged(String str, Bundle bundle) throws RemoteException;
}