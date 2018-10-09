package android.microntek;

import android.microntek.ICarService.Stub;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CarManager {
    public static final int MSG_ON_STATUS = -1;
    private static final String TAG = "MtcCarManager";
    private CarManageCallback mCarManageCallback = new CarManageCallback() {
        public void onStatusChanged(String type, Bundle bundle) {
            if (!CarManager.this.mType.contains(type)) {
                return;
            }
            if (CarManager.this.mHandler != null) {
                try {
                    Message msg = Message.obtain(CarManager.this.mHandler, -1);
                    msg.obj = type;
                    msg.setData(bundle);
                    CarManager.this.mHandler.sendMessage(msg);
                } catch (Exception e) {
                }
            } else if (CarManager.this.mListener != null) {
                try {
                    CarManager.this.mListener.onStatusChanged(type, bundle);
                } catch (Exception e2) {
                }
            }
        }
    };
    private ICarService mCarService;
    private Handler mHandler;
    private CarListener mListener;
    private String mType;

    public CarManager() {
        if (this.mCarService == null) {
            this.mCarService = Stub.asInterface(getCarService());
        }
    }

    private static IBinder getCarService() {
        try {
            Class localClass = Class.forName("android.os.ServiceManager");
            Method getService = localClass.getMethod("getService", new Class[] {String.class});

            if(getService != null) {
                return (IBinder)getService.invoke(localClass, new Object[]{"carservice"});
            }
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void attach(Handler handler, String type) {
        if (this.mHandler == null && this.mListener == null && handler != null && type != null) {
            this.mHandler = handler;
            this.mType = type;
            try {
                this.mCarService.registerCallback(this.mCarManageCallback);
            } catch (Exception e) {
            }
        }
    }

    public void attach(CarListener listener, String type) {
        if (this.mHandler == null && this.mListener == null && listener != null && type != null) {
            this.mListener = listener;
            this.mType = type;
            try {
                this.mCarService.registerCallback(this.mCarManageCallback);
            } catch (Exception e) {
            }
        }
    }

    public void detach() {
        if (this.mHandler != null || this.mListener != null) {
            try {
                this.mCarService.unregisterCallback(this.mCarManageCallback);
            } catch (Exception e) {
            }
            this.mHandler = null;
            this.mListener = null;
        }
    }

    public void putState(String key, boolean value) {
        try {
            this.mCarService.putBooleanState(key, value);
        } catch (Exception e) {
        }
    }

    public void putState(String key, byte value) {
        try {
            this.mCarService.putByteState(key, value);
        } catch (Exception e) {
        }
    }

    public void putState(String key, int value) {
        try {
            this.mCarService.putIntState(key, value);
        } catch (Exception e) {
        }
    }

    public void putState(String key, String value) {
        try {
            this.mCarService.putStringState(key, value);
        } catch (Exception e) {
        }
    }

    public void putState(String key, byte[] value) {
        try {
            this.mCarService.putByteArraryState(key, value);
        } catch (Exception e) {
        }
    }

    public void putState(String key, int[] value) {
        try {
            this.mCarService.putIntArraryState(key, value);
        } catch (Exception e) {
        }
    }

    public void putState(String key, String[] value) {
        try {
            this.mCarService.putStringArraryState(key, value);
        } catch (Exception e) {
        }
    }

    public boolean getBooleanState(String key) {
        try {
            return this.mCarService.getBooleanState(key);
        } catch (Exception e) {
            return false;
        }
    }

    public byte getByteState(String key) {
        try {
            return this.mCarService.getByteState(key);
        } catch (Exception e) {
            return (byte) 0;
        }
    }

    public int getIntState(String key) {
        try {
            return this.mCarService.getIntState(key);
        } catch (Exception e) {
            return 0;
        }
    }

    public String getStringState(String key) {
        try {
            return this.mCarService.getStringState(key);
        } catch (Exception e) {
            return null;
        }
    }

    public byte[] getByteArrayState(String key) {
        try {
            return this.mCarService.getByteArrayState(key);
        } catch (Exception e) {
            return null;
        }
    }

    public int[] getIntArrayState(String key) {
        try {
            return this.mCarService.getIntArrayState(key);
        } catch (Exception e) {
            return null;
        }
    }

    public String[] getStringArrayState(String key) {
        try {
            return this.mCarService.getStringArrayState(key);
        } catch (Exception e) {
            return null;
        }
    }

    public void setParameters(String par) {
        try {
            this.mCarService.setParameters(par);
        } catch (Exception e) {
        }
    }

    public String getParameters(String par) {
        try {
            return this.mCarService.getParameters(par);
        } catch (Exception e) {
            return null;
        }
    }

    public void putDataChanage(String type, String state) {
        try {
            this.mCarService.putDataChanage(type, state);
        } catch (Exception e) {
        }
    }

    public void dispatchMessage(String type, Bundle bundle) {
        try {
            this.mCarService.dispatchMessage(type, bundle);
        } catch (Exception e) {
        }
    }

    public void dispatchMessage(String type) {
        try {
            this.mCarService.dispatchMessage(type, null);
        } catch (Exception e) {
        }
    }

    public void setEqIdx(int idx) {
        try {
            this.mCarService.setEqIdx(idx);
        } catch (Exception e) {
        }
    }

    public int getEqIdx() {
        try {
            return this.mCarService.getEqIdx();
        } catch (Exception e) {
            return 0;
        }
    }

    public void setLud(boolean on) {
        try {
            this.mCarService.setLud(on);
        } catch (Exception e) {
        }
    }

    public int getLud() {
        try {
            return this.mCarService.getLud();
        } catch (Exception e) {
            return 0;
        }
    }

    public void setVideoOverSpeed(boolean overSpeed) {
        try {
            this.mCarService.setVideoOverSpeed(overSpeed);
        } catch (Exception e) {
        }
    }

    public boolean getVideoEnable() {
        try {
            return this.mCarService.getVideoEnable();
        } catch (Exception e) {
            return false;
        }
    }
}