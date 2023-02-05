public enum DirectionTo {
    north,
    south,
    west,
    east;


        public static DirectionTo getOpposite(DirectionTo dir) {
            switch(dir) {
                case north:
                    return south;
                case south:
                    return north;
                case east:
                    return west;
                case west:
                    return east;
            }

            return null;
        }
    }


