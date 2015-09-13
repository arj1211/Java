/*
 * # CCC 2015 Junior 5: Pie Day
#
# This is a recursion problem (or possibliy a Dynamic Programming problem)
#
# This is the recursive solution. 
# 
# Given n (number of pieces of pie) and k (number of people) and the minimum
# number of pieces that can be taken, the number of ways the pie can be destributed
# is:
#     1 if n = k or k = 1
#     otherwise it is the sum of the ways of (n-i, k-1, i) where i goes from
#                min to n/k (inclusive)
#
# an example might help: pi(9,4,1)
#   n = 9, k = 4 and min = 1
#   for this the answer is calculated as follows:
#       the first person could take 1 piece leaving us the task of finding the ways
#                with now 8 pieces (9-1), 3 people and a min of 1 (= pi(8,3,1))
#       the first person could take 2 pieces leaving us the task of finding the ways
#                with now 7 pieces (9-2), 3 people and a min of 2 (= pi(7,3,2))
#       the first person could NOT take 3 pieces (or more)_because that would leave 6
#                pieces for 3 people and since the first person took 3, they
#                would have to take at least 3 themselves and that's 9 not 6 pieces!
#                in general, the most the first person person can take is
#                                               n/k (eg 9/4 = 2)
#
 */

package ccc.contest.fifteen;

import java.util.Scanner;

public class J5 {

	public static int pi(int n, int k, int min) {

		if (n == k)
			return 1;
		else if (k == 1)
			return 1;
		else {
			int t = 0;
			for (int i = min; i <= (n / k); i++) {
		
				t += pi(n - i, k - 1, i);
				
			}
			return t;
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		scan.close();
		System.out.println(pi(n, k, 1));

	}
}