package Block3;

public class Robot {

    public Direction getDirection()  {
        // текущее направление взгляда
        return null;
    }

    public int getX() {
        // текущая координата X

        return 0;
    }

    public int getY() {
        // текущая координата Y

        return 0;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int dx = robot.getX() - toX, dy = robot.getY() - toY;

        Direction dirX = dx > 0 ? Direction.LEFT : Direction.RIGHT;
        Direction dirY = dy > 0 ? Direction.DOWN : Direction.UP;

        dx = Math.abs(dx);
        dy = Math.abs(dy);

        while (robot.getDirection() != dirX) robot.turnRight();
        while (dx-- > 0) robot.stepForward();

        while (robot.getDirection() != dirY) robot.turnRight();
        while (dy-- > 0) robot.stepForward();
    }
}