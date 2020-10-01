#include<iostream>
using namespace std;
void leaders(int arr[],int n)
{
	int max = arr[n-1];
	cout<<max<<endl;
	for(int i =n-2;i>=0;i--)
	{
		if(arr[i]>arr[i-1]  && arr[i]>max)
		{
			max =arr[i];
			cout<<max<<endl;
		}
		else
			continue;
	}
}
int main()
{
	int i;
	int arr[]={16,17,4,3,5,2};
	int n = sizeof(arr)/sizeof(arr[0]);
	leaders(arr,n);
	return 0;

}
