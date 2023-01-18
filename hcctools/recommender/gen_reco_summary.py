import os
import csv

parent_dir='/Users/soneya/Documents/OMC_FSE/recommender/subjects/joda_time/evaluation/'
with os.scandir(parent_dir) as entries:
    for entry in entries:
        if ".DS_Store" in entry.name:
            continue
        result = parent_dir+"/result/result.csv"
        skip_header=1
        with open(result) as fin:
            total_assertion = 0
            total_in_top1=0
            total_in_top5=0
            total_in_top10=0
            for row in csv.reader(fin):
                if skip_header:
                    skip_header=0
                    continue
                total_assertion += int(row[1])
                total_in_top1 += int(row[3])
                total_in_top5 += int(row[4])
                total_in_top10 += int(row[5])

            header = ['subject', 'total_assertion', 'top_1(%)', 'top_5(%)', 'top_10(%)' ]
            data = ['joda_time', total_assertion, (total_in_top1/total_assertion)*100, (total_in_top5/total_assertion)*100, (total_in_top10/total_assertion)*100]

            with open(parent_dir+'/result/summary.csv', 'w', encoding='UTF8') as f:
                writer = csv.writer(f)
                # write the header
                writer.writerow(header)
                # write the data
                writer.writerow(data)
