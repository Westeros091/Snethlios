use Snethlios
go
--insert chucvu
select * from Chucvu
insert into dbo.ChucVu values ('TV001',N'Nguyễn Văn Hải',N'Tư vấn')
insert into dbo.ChucVu values ('TN002',N'Trần Xuân Quỳnh',N'Thu ngân')
insert into dbo.ChucVu values ('TV003',N'Lê Thái Hậu',N'Tư vấn')
insert into dbo.ChucVu values ('KK006',N'Nguyễn Anh Thái',N'Kiểm kho')
insert into dbo.ChucVu values ('NV007',N'Lê Văn Hải',N'Kiểm kho')
insert into dbo.ChucVu values ('QLK01',N'Nguyễn Đức Cường',N'Quản lý kho')
insert into dbo.ChucVu values ('BV009',N'Nguyễn Lê Hải Xuân',N'Bảo vệ')
insert into dbo.ChucVu values ('CHT010',N'Nguyễn Văn Hải',N'Cửa hàng trưởng')
--insert khachhang
select*from KhachHang
insert into KhachHang values ('KH001',N'Lê Văn Quý',N'1660/48A Lê Hồng Phong,quận 2 TPHCM','0383099555',0,N'Giao vào buổi chiều')
insert into KhachHang values ('KH002',N'Nguyễn Xuân Quy',N'2210/68 quốc lộ 1A,quận 12 TPHCM','0353095455',1,N'Giao buổi sáng')
insert into KhachHang values ('KH003',N'Trần Quốc Kỳ',N'2310 Nguyễn Oanh,quận Gò Vấp TPHCM','0383255625',0,N'Gọi trước 30 phút')
insert into KhachHang values ('KH004',N'Lê Đặng Trung Anh',N'2356/12 Lê Đức Thọ,quận Gò Vấp TPHCM','0393233451',0,N'Giao sau chiều')
insert into KhachHang values ('KH005',N'Nguyễn Thị Xuân',N'126/12 Lê Lữ, quận Tân Phú TPHCM','0384757576',0,N'Giao vào buổi sáng và gọi trước 15p')
insert into KhachHang values ('KH006',N'Nguyễn Ngọc Bảo Anh',N'2360/24A Tân Kỳ Tân Quý,Tân Phú HCM','0389485554',0,N'Đường khó vào nên gọi để anh khách rước')
--insert nhacungcap
select*From NhaCungCap
insert into NhaCungCap values('CHN1',N'Quảng Châu',N'Kho Tứ Xuyên, thành phố Tô Châu, tỉnh Quảng Nam','8135526552',N'28-3-2022')
insert into NhaCungCap values('KH1',N'Khách hàng',N'2210/68 quốc lộ 1A,quận 12 TPHCM','0383955778',N'Adid 39,40')
insert into NhaCungCap values('TH1',N'Thái Lan','Bangkok capital','51955255',N'9-11-2022')
insert into NhaCungCap values('KH2',N'Store Giày SDK',N'241/2 Tân Kỳ Tân Quý,Tân Phú HCM','8135526552',N'28-3-2022')
--delete from NhaCungCap
--insert phieunhap(hoan`)
select*from PhieuNhap
insert into PhieuNhap values ('PN001','MaNHANVIEN','QLK01',N'Quảng Châu','28-3-2022',N'Chuyển khoản')
--insert phieuxuat(hoan`)
select*From PhieuXuat
insert into PhieuXuat values('PX001',)

--sanpham
select*From SanPham
insert into Sanpham values ('AD1','PN001',N'Giày Adidas','39',N'Giày thể thao','Adidas',N'Đen')
insert into SanPham values ('NK1','PN002',N'Giày Nike','39',N'Giày thể thao','Nike',N'Trắng')
insert into SanPham values ('PM1','PN003',N'Giày Puma','39',N'Giày lười','Puma',N'Trắng')
insert into SanPham values ('Vs1','PN004',N'Giày Vans','39',N'Giày thể thao','Vans',N'Trắng')
insert into SanPham values ('JD1','PN005',N'Giày Jordan','39',N'Giày cổ cao','Jordan',N'Trắng')
insert into SanPham values ('GC1','PN006',N'Giày Gucci','39',N'Giày thể thao','Gucci',N'Đen')

-- table nhanvien

insert into NhanVien values(1,'TV001',N'Nguyễn Văn Hải', CONVERT(varchar(32), HashBytes('MD5', 'songlong'), 2), 'hinh1.png')
drop table NhanVien