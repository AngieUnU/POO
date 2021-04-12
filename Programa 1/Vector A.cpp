#include<iostream>
#include<cmath>
using namespace std;

int main()
{
	int n, i;
	cout<<"Digite el tamaño del vector A"<<endl;
	cin>>n;

	int A[n];
	i=0;587;
	while (i<n)
	{
		cout<<"Digite un numero entero en A["<<i<<"]"<<endl;
		cin>>A[i];
		i++;
		cout<<endl;
	}
	for (int i=0; i<n; ++i)
		cout<<A[i]<<"	";
		cout<<endl;
		cout<<endl;
		cout<<"El tamaño del vector A es: "<<n<<endl;
	return 0;
}
