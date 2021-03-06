package org.usfirst.frc.team694.robot;

/**
 * RobotMap contains the field measurements that we use in our autons.
 * All of our autons should be based on the field so that if our measurements 
 * change, we can adapt quickly. All measurements are in inches for encoder purposes.
 */
public final class FieldMapBlueNearScoringTableQuadrant extends FieldMapMiddleNearScoringTableHalf{

    //Scale auton where the bot and the scoring scale are on the same side
    @Override
    public double getTotalDistanceToTravelToReachNullLine() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_TRAVEL_TO_REACH_NULL_TERRITORY_LINE;
    }

    @Override
    public double getAngleToReachIdealStartingPointFromNullTerritoryLine() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_REACH_IDEAL_STARTING_POINT_FROM_NULL_TERRITORY_LINE;
    }

    @Override
    public double getDistanceToTravelToReachScaleCorner() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_SCALE_CORNER;
    }

    //Scale auton where the bot and the scoring scale are on different sides
    @Override
    public double getTotalDistanceToTravelBeforeTurn() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_TRAVEL_BEFORE_FIRST_TURN;
    }

    @Override
    public double getDistanceFromLineSensorToAutoLine() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_LINE_SENSOR_TO_AUTO_LINE;
    }

    @Override
    public double getAngleToTurnToReachPlatformZone() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_TURN_TO_REACH_PLATFORM_ZONE;
    }

    @Override
    public double getTotalDistanceToTravelToReachOtherSideOfPlatformZone() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_TRAVEL_ACROSS_PLATFORM_ZONE;
    }

    @Override
    public double getDistanceToTravelToReachPlatformZone() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_PLATFORM_ZONE_EDGE_AFTER_TURN;
    }

    @Override
    public double getDistanceFromEdgeOfPlatformZoneToBump() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_PLATFORM_ZONE_EDGE_TO_BUMP;
    }
    
    @Override
    public double getDistanceFromStartingPointToOtherPlatformZoneEdge() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_STARTING_POINT_TO_OTHER_PLATFORM_ZONE_EDGE;
    }

    @Override
    public double getAngleToTurnToReachScaleSide() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_TURN_TO_REACH_SCALE_SIDE;
    }

    @Override
    public double getTotalDistanceToTravelToReachScaleSide() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_SCALE_SIDE;
    }

    @Override
    public double getDistanceFromRobotAfterTwoTurnsToNullTerritory() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_NULL_LINE;
    }
    
  //Scale auton where the bot and the scoring scale are on the same side (backup)
    @Override
    public double getTotalDistanceFromFrontOfBotToNullBump() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_FROM_ROBOT_STARTING_POINT_TO_NULL_BUMP;
    }

    @Override
    public double getDistanceFromLineSensorToNullTerritoryLine() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_LINE_SENSOR_TO_NULL_TERRITORY_LINE;
    }

    @Override
    public double getAngleToTurnToReachScaleEdge() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_TURN_IN_NULL_TERRITORY;
    }

    @Override
    public double getDistanceToMoveBackward() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_BACKWARDS;
    }

    @Override
    public double getDistanceToReachScaleEdge() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_SCALE_EDGE;
    }
    
    //Switch auton where the bot and the scoring switch are on the same side and moving forward
    @Override
    public double getDistanceToDriveForwardToReachSwitchSide() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_FROM_FRONT_OF_BOT_TO_SWITCH_SIDE;
    }
    
    //Switch auton where the bot and the scoring switch are on the same side and turning a right angle
    @Override
    public double getTotalDistanceToDriveForwardToReachSwitch() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_MOVE_FORWARD_TO_REACH_MIDDLE_OF_SWITCH;
    }

    @Override
    public double getDistanceToDriveForwardIntoSwitchEdge() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_MOVE_TO_REACH_SCALE_EDGE;
    }
    
    //Switch auton where the bot and the scoring switch are on different side  
    @Override
    public double getTotalDistanceToTravelAcrossPlatformZoneToReachSwitch() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_TRAVEL_ACROSS_PLATFORM_ZONE_TO_SWITCH;
    }

    @Override
    public double getAngleToReachSwitch() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_REACH_SWITCH;
    }

    @Override
    public double getDistanceToTravelToReachSwitch() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_REACH_SWITCH;
    }

    @Override
    public double getAngleToReachSwitchEdge() {
        return BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_REACH_SWITCH_EDGE;
    }
    //**************************************************************************************************************
    
/* Given FRC Manual Measurements*/
    //These distances is us starting on the left side of the field
    //all measurements are in inches or degrees if specified 
    //anything with // could be changed due to the actual field measure 
    
    //These are the measurements that need to be measured out before match.
    private static final double BLUE_NEAR_SCROING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_SWITCH_EDGE = 85.25;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_MIDDLE_OF_SWITCH = 168;
    public static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_PLATFORM_ZONE_EDGE_TO_BUMP = 66.75; //
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_NULL_TERRITORY = 288.0; //
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_AUTO_LINE = 120.0; //
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_FAR_SIDE_OF_SWITCH = 196.0; //
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_PLATFORM_EDGE = 261.47; //
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_SCALE_SIDE = 299.65; //
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_PLATFORM_ZONE_EDGE = 95.25; //
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_EDGE_OF_ROBOT = 29.69 + 12.0; //
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_SWITCH_SIDE = 140.0; //

    //**************************************************************************************************************
    
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_OTHER_EDGE_OF_ROBOT = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_EDGE_OF_ROBOT + RobotMap.WIDTH_OF_BOT;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_ROBOT_STARTING_POINT = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_EDGE_OF_ROBOT + RobotMap.MIDDLE_OF_BOT_WIDTHWISE; //
    
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_SIDE_TO_NULL_TERRITORY = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_SCALE_SIDE - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_NULL_TERRITORY;
    public static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_FAR_SIDE_OF_SWITCH_TO_SCALE_SIDE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_SCALE_SIDE - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_FAR_SIDE_OF_SWITCH;

    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_LINE_SENSOR_TO_AUTO_LINE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_AUTO_LINE - (RobotMap.LENGTH_OF_BOT - RobotMap.DISTANCE_LINE_SENSOR_IS_FROM_FRONT_BUMPER_OF_BOT);
   
    //**************************************************************************************************************
    //Scale auton where the bot is on the same side as the alliance scale and bot will be in the null territory
    //Keep in case the other scale auton doesn't work
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_AUTO_LINE_TO_NULL_TERRITORY_LINE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_NULL_TERRITORY - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_AUTO_LINE;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_FRONT_OF_BOT_TO_AUTO_LINE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_AUTO_LINE - RobotMap.LENGTH_OF_BOT;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_FROM_ROBOT_STARTING_POINT_TO_NULL_BUMP = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_FRONT_OF_BOT_TO_AUTO_LINE + RobotMap.MIDDLE_OF_BOT_LENGTHWISE;
    private static final int BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_TURN_IN_NULL_TERRITORY = -90;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_BACKWARDS = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_EDGE_OF_ROBOT - RobotMap.DIFFERENCE_BETWEEN_LENGTH_OF_ROBOT_AND_WIDTH_OF_ROBOT_AFTER_TURN; 
    private final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_SCALE_EDGE = getDistanceFromBorderToScaleEdge() - RobotMap.LENGTH_OF_BOT;
    
    //Scale auton where the bot is on the same side as the alliance scale and bot will turn at null territory line
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_AUTO_LINE_TO_NULL_TERRITORY = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_NULL_TERRITORY - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_AUTO_LINE;
    private final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_EDGE_TO_MIDDLE_OF_ROBOT = getDistanceFromBorderToScaleEdge() - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_ROBOT_STARTING_POINT;
    private final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_EDGE_TO_MIDDLE_OF_ROBOT_SQUARED = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_EDGE_TO_MIDDLE_OF_ROBOT * BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_EDGE_TO_MIDDLE_OF_ROBOT;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_SIDE_TO_NULL_TERRITORY_SQUARED = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_SIDE_TO_NULL_TERRITORY * BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_SIDE_TO_NULL_TERRITORY;
    private final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_SCALE_CORNER = Math.sqrt(BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_EDGE_TO_MIDDLE_OF_ROBOT_SQUARED + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_SIDE_TO_NULL_TERRITORY_SQUARED);
    private final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_REACH_IDEAL_STARTING_POINT_FROM_NULL_TERRITORY_LINE = -1 * Math.toDegrees(Math.atan(BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_EDGE_TO_MIDDLE_OF_ROBOT / BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_SIDE_TO_NULL_TERRITORY));
    
    //Scale auton where the bot is on the other side of the alliance scale
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_AUTO_LINE_TO_FAR_SIDE_OF_SWITCH = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_FAR_SIDE_OF_SWITCH - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_AUTO_LINE;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_FAR_SIDE_OF_SWITCH_TO_PLATFORM_EDGE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_PLATFORM_EDGE - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_FAR_SIDE_OF_SWITCH;
    public static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_FAR_SIDE_OF_SWITCH_TO_PLATFORM_EDGE_HALVED = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_FAR_SIDE_OF_SWITCH_TO_PLATFORM_EDGE / 2;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_BEFORE_FIRST_TURN_FROM_AUTO_LINE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_AUTO_LINE_TO_FAR_SIDE_OF_SWITCH + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_FAR_SIDE_OF_SWITCH_TO_PLATFORM_EDGE_HALVED + (RobotMap.MIDDLE_OF_BOT_LENGTHWISE - RobotMap.DISTANCE_LINE_SENSOR_IS_FROM_FRONT_BUMPER_OF_BOT); 
    private static final int BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_TURN_TO_REACH_PLATFORM_ZONE = 90;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_PLATFORM_ZONE_EDGE_AFTER_TURN = (BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_PLATFORM_ZONE_EDGE - (BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_OTHER_EDGE_OF_ROBOT + RobotMap.DIFFERENCE_BETWEEN_LENGTH_OF_ROBOT_AND_WIDTH_OF_ROBOT_AFTER_TURN)) + RobotMap.DISTANCE_LINE_SENSOR_IS_FROM_FRONT_BUMPER_OF_BOT;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_PLATFORM_ZONE_EDGE_TO_OTHER = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_PLATFORM_ZONE_EDGE_TO_BUMP + FieldMapRedNearScoringTableQuadrant.RED_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_PLATFORM_ZONE_EDGE_TO_BUMP;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_DRIVE_OUT_AFTER_PLATFORM_ZONE = RobotMap.WIDTH_OF_BOT - RobotMap.DISTANCE_LINE_SENSOR_IS_FROM_FRONT_BUMPER_OF_BOT; 
    private static final int BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_TURN_TO_REACH_SCALE_SIDE = -90;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_SCALE_SIDE = FieldMapBlueFarFromScoringTableQuadrant.BLUE_FAR_FROM_SCORING_TABLE_QUADRANT_DISTANCE_FROM_FAR_SIDE_OF_SWITCH_TO_SCALE_SIDE - FieldMapBlueFarFromScoringTableQuadrant.BLUE_FAR_FROM_SCORING_TABLE_QUADRANT_DISTANCE_FROM_FAR_SIDE_OF_SWITCH_TO_PLATFORM_EDGE_HALVED;

    //**************************************************************************************************************
    
    //Switch auton where the bot is on the same side as the scoring switch and just moving forward
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_FROM_FRONT_OF_BOT_TO_SWITCH_SIDE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_SWITCH_SIDE - RobotMap.LENGTH_OF_BOT;
    
    //Switch auton where the bot is on the same side as the scoring switch and turning a right angle
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_MOVE_FORWARD_TO_REACH_MIDDLE_OF_SWITCH = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_MIDDLE_OF_SWITCH - RobotMap.MIDDLE_OF_BOT_LENGTHWISE;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_MOVE_TO_REACH_SCALE_EDGE = BLUE_NEAR_SCROING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_SWITCH_EDGE - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_EDGE_OF_ROBOT - (RobotMap.WIDTH_OF_BOT + RobotMap.DIFFERENCE_BETWEEN_LENGTH_OF_ROBOT_AND_WIDTH_OF_ROBOT_AFTER_TURN);
    
  //Switch auton where the bot is on different sides as the scoring switch
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_DRIVE_OUT_TO_REACH_SWITCH = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_PLATFORM_ZONE_EDGE - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_BORDER_TO_EDGE_OF_ROBOT - RobotMap.DISTANCE_LINE_SENSOR_IS_FROM_FRONT_BUMPER_OF_BOT;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_TRAVEL_ACROSS_PLATFORM_ZONE_TO_SWITCH = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_PLATFORM_ZONE_EDGE_AFTER_TURN + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_PLATFORM_ZONE_EDGE_TO_OTHER + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_DRIVE_OUT_TO_REACH_SWITCH + RobotMap.DIFFERENCE_BETWEEN_LENGTH_OF_ROBOT_AND_WIDTH_OF_ROBOT_AFTER_TURN;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_REACH_SWITCH = -90;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_REACH_SWITCH = (BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_FAR_SIDE_OF_SWITCH - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_ALLIANCE_STATION_TO_MIDDLE_OF_SWITCH) + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_FAR_SIDE_OF_SWITCH_TO_PLATFORM_EDGE_HALVED;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DEGREE_OF_ANGLE_TO_REACH_SWITCH_EDGE = -90;

    //**************************************************************************************************************
    //Measurements for line system
    //Use the constants these constants are set to to use for reset encoders
    //Different side scale auton
    //Reset encoders 3 times
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_TRAVEL_BEFORE_FIRST_TURN = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_LINE_SENSOR_TO_AUTO_LINE + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_BEFORE_FIRST_TURN_FROM_AUTO_LINE;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_TRAVEL_ACROSS_PLATFORM_ZONE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_PLATFORM_ZONE_EDGE_AFTER_TURN + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_PLATFORM_ZONE_EDGE_TO_OTHER + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_DRIVE_OUT_AFTER_PLATFORM_ZONE;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_STARTING_POINT_TO_OTHER_PLATFORM_ZONE_EDGE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_PLATFORM_ZONE_EDGE_AFTER_TURN + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_PLATFORM_ZONE_EDGE_TO_OTHER;
    //private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_SCALE_SIDE = FieldMapSideFurthestFromScoringTableBlueQuadrant.SIDE_FURTHEST_FROM_SCORING_TABLE_BLUE_QUADRANT_DISTANCE_FROM_FAR_SIDE_OF_SWITCH_TO_SCALE_SIDE - FieldMapSideFurthestFromScoringTableBlueQuadrant.SIDE_FURTHEST_FROM_SCORING_TABLE_BLUE_QUADRANT_DISTANCE_FROM_FAR_SIDE_OF_SWITCH_TO_PLATFORM_EDGE_HALVED;
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_NULL_LINE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_TO_TRAVEL_TO_REACH_SCALE_SIDE - BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_SCALE_SIDE_TO_NULL_TERRITORY;
    
    //Same side scale auton
    //Reset encoders once
    private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_TOTAL_DISTANCE_TO_TRAVEL_TO_REACH_NULL_TERRITORY_LINE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_LINE_SENSOR_TO_AUTO_LINE + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_AUTO_LINE_TO_NULL_TERRITORY - RobotMap.DISTANCE_LINE_SENSOR_IS_FROM_FRONT_BUMPER_OF_BOT;

        //Backup
        private static final double BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_LINE_SENSOR_TO_NULL_TERRITORY_LINE = BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_AUTO_LINE_TO_NULL_TERRITORY_LINE + BLUE_NEAR_SCORING_TABLE_QUADRANT_DISTANCE_FROM_LINE_SENSOR_TO_AUTO_LINE;
    //**************************************************************************************************************
}
