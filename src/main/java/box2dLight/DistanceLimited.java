package box2dLight;

/**
 * Created by etsvigun on 7/16/15.
 */
public interface DistanceLimited {
    void setDistanceValue(float dist);
    /**
     * @return rays distance of this light (without gamma correction)
     */
    float getDistanceValue();


    void setDistance(float dist);

    float getDistance();
}
