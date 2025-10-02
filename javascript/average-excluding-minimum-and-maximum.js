// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
// Input: salary = [4000,3000,1000,2000]
// Output: 2500

var average = function (salary) {
  const min = Math.min(...salary);
  const max = Math.max(...salary);
  salary = salary.filter((el) => el !== min && el !== max);
  return (
    salary
      .reduce((sum, element) => (sum = element + sum), 0) / salary.length
  );
};