package box2dLight;

/**
 * Created by etsvigun on 7/17/15.
 */
abstract class DistanceLimitedImpl {
    static <T extends Light & DistanceLimited> void setDistance(T light, float dist){
        dist *= RayHandler.gammaCorrectionParameter;
        light.setDistanceValue(dist < 0.01f ? 0.01f : dist);
        light.dirty = true;
    }

    static <T extends Light & DistanceLimited> float getDistance(T light){
        return light.getDistanceValue() / RayHandler.gammaCorrectionParameter;
    }
}
