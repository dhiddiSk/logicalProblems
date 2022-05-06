/*
Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

*/
const minimumClassRoomsRequired = function(...classIntervals) {
        
        const startingIntervalTime = [];
        const endingIntervalTime = [];

        // 'numberOfmeetingInParallel' provides us the value of number of meeting happeing in parallel
        let numberOfmeetingInParallel = 0;
        let roomCount = [];

        for (let interval of arguments) {
            startingIntervalTime.push(interval[0]);
            endingIntervalTime.push(interval[1]);
        }

        startingIntervalTime.sort(function (a, b) { return a - b });
        endingIntervalTime.sort(function (a, b) { return a - b });

        for (const startTime of startingIntervalTime){
            for(const endTime of endingIntervalTime){
                // if startingIntervalTime point is less than any of the ending points then increment the number of rooms roomCount
                if (startTime < endTime) {
                    numberOfmeetingInParallel++;
                    roomCount.push(numberOfmeetingInParallel);
                    break;
                }
                else {
                    numberOfmeetingInParallel--;
                    roomCount.push(numberOfmeetingInParallel);
                    break;
                }
            }
        }

        roomCount.sort(function (a, b) { return a - b });
        // Total minimum number of rooms required for given intervals
        return roomCount[roomCount.length - 1];
}

console.log(minimumClassRoomsRequired([0, 30], [5, 10], [11, 90]));
