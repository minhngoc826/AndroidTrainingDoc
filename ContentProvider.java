// https://developer.android.com/guide/topics/providers/content-provider-basics?hl=vi#ContentURIs

1. Tổng quan:
- Chia sẻ quyền truy cập vào dữ liệu ứng dụng của bạn với các ứng dụng khác
- Gửi dữ liệu vào tiện ích
- Trả về nội dung đề xuất tìm kiếm tuỳ chỉnh cho ứng dụng của bạn thông qua khung tìm kiếm bằng SearchRecentSuggestionsProvider
- Đồng bộ hoá dữ liệu ứng dụng với máy chủ của bạn bằng cách triển khai AbstractThreadedSyncAdapter
- Tải dữ liệu trong giao diện người dùng bằng CursorLoader

  


