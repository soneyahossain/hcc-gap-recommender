subjects="commons-cli commons-codec-1.12 commons-csv commons-validator commons-lang-3.6 jaxen-1.2.0 joda-time gson jackson-dataformat-xml jfreechart jsoup-1.10.1 plexus-utils xstream"

date
echo "Compute baseline statement and object-branch coverage for subjects: $subjects"
for s in $subjects
do
	./clean-build-clover.sh $s
	./clean-build-jacoco.sh $s
done

date
echo "Compute HCC statement and object-branch gaps"
for s in $subjects
do
	./compute_hcc_from_slices.sh $s	
done
