// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

var average = function (salary) {
  const min = Math.min(...salary);
  const max = Math.max(...salary);
  salary = salary.filter((el) => el !== min && el !== max);
  return (
    salary
      .filter((el) => el !== min && el !== max)
      .reduce((sum, element) => (sum = element + sum), 0) / salary.length
  );
};
  
console.log(average([4000, 3000, 1000, 2000]));
